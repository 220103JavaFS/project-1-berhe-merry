package com.revature.repos;
import com.revature.util.ConnectionUtil;
import java.sql.Connection;
import java.sql.SQLException;

public class ManagerDAOImpl implements ManagerDAO{

    /**
     * Manager can either approve or deny a request
     * @param status is either APPROVE or DENY
     */
    @Override
    public void editRequests(String status) {
        try (Connection conn = ConnectionUtil.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
