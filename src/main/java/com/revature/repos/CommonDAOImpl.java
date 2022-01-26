package com.revature.repos;

import com.revature.models.Reimb;
import com.revature.models.Users;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Locale;

public class CommonDAOImpl implements CommonDAO {

    public CommonDAOImpl() {
    }


    /**
     * Method used by Employee since they can only view their Reimbursements
     * This could be used by a manager if they are searching by a specific employee
     * @param userID
     * @param queryType
     * @return
     */
    @Override
    public ArrayList<Reimb> viewAll(int userID, String queryType) {
        try (Connection conn = ConnectionUtil.getConnection()) {
            String sql;
            PreparedStatement statement;

            if(queryType.equalsIgnoreCase("all")) {
                sql = "SELECT * FROM ers_reimbursement " +
                        "INNER JOIN ers_reimbursement_status ON ers_reimbursement.reimb_status_id = " +
                        "ers_reimbursement_status.reimb_status_id " +
                        "INNER JOIN ers_reimbursement_type  ON ers_reimbursement.reimb_type_id = " +
                        "ers_reimbursement_type.reimb_type_id " +
                        "WHERE ers_reimbursement.reimb_author =CAST (? AS INT);";
                statement = conn.prepareStatement(sql);
                statement.setString(1, Integer.toString(userID));
            } else {
                queryType = queryType.toUpperCase(Locale.ROOT);
                sql = "SELECT * FROM ers_reimbursement " +
                        "INNER JOIN ers_reimbursement_status ON ers_reimbursement.reimb_status_id = " +
                        "ers_reimbursement_status.reimb_status_id " +
                        "INNER JOIN ers_reimbursement_type  ON ers_reimbursement.reimb_type_id = " +
                        "ers_reimbursement_type.reimb_type_id " +
                        "WHERE ers_reimbursement.reimb_author =CAST(? AS INT) AND reimb_status = ?;";
                statement = conn.prepareStatement(sql);
                statement.setString(1, Integer.toString(userID));
                statement.setString(2, queryType);
            }

            ArrayList<Reimb> reimbs = null;
            ResultSet result = statement.executeQuery();
                reimbs = new ArrayList<>();
                Reimb r = new Reimb();
                while (result.next()) {
                    r.setId(result.getInt("reimb_id"));
                    r.setAmount(result.getDouble("reimb_amount"));
                    r.setTimeSubmitted(result.getString("reimb_submitted"));
                    r.setTimeResolved(result.getString("reimb_resolved"));
                    r.setDescription(result.getString("reimb_description"));
                    //reimb_receipt
                    r.setAuthor(result.getInt("reimb_author"));
                    r.setResolver(result.getInt("reimb_resolver"));
                    r.setStatusID(result.getString("reimb_status"));
                    r.setTypeID(result.getString("reimb_type"));
                    reimbs.add(r);
                }

            return reimbs;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method used by Financial manager, since they can view all employees
     * @param queryType
     * @return
     */
    @Override
    public ArrayList<Users> viewAll(String queryType) {
        try (Connection conn = ConnectionUtil.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
