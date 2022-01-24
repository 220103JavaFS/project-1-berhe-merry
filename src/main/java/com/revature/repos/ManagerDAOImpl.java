package com.revature.repos;
import com.revature.models.EditTicketDTO;
import com.revature.models.Reimb;
import com.revature.util.ConnectionUtil;
import java.sql.Connection;
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

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
