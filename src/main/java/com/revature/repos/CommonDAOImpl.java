package com.revature.repos;

import com.revature.models.Reimb;
import com.revature.models.Users;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

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

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
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
        return new ArrayList<>();
    }
}
