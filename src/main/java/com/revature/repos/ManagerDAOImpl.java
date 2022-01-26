package com.revature.repos;
import com.revature.models.EditTicketDTO;
import com.revature.models.Reimb;
import com.revature.util.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManagerDAOImpl implements ManagerDAO{

    /**
     * Manager can either approve or deny a request. Will return the updated Reimbursement
     * @param editTicketDTO
     * @return
     */
    @Override
    public Reimb editRequests(EditTicketDTO editTicketDTO) {
        try (Connection conn = ConnectionUtil.getConnection()) {
            String sql = "UPDATE ers_reimbursement SET reimb_status_id=CAST (? AS INT) WHERE reimb_id = CAST (? AS " +
                    "INT) RETURNING *;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, Integer.toString(editTicketDTO.status));
            statement.setString(2, Integer.toString(editTicketDTO.reimbID));
            ResultSet result = statement.executeQuery();
            Reimb reimb = null;
            if(result.next()) {
//                reimb = new Reimb(result.getInt("reimb_id"), result.getDouble("reimb_amount"),
//                        result.getString("reimb_submitted"), result.getString("reimb_resolved"),
//                        result.getString("reimb_description"), result.getBlob("reimb_receipt"),
//                        result.getInt("reimb_author"), result.getInt("reimb_resolver"),
//                        result.getInt("reimb_status_id"), result.getInt("reimb_type_id"));
            }
            return reimb;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
