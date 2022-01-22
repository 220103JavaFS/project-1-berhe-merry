package com.revature.repos;
import com.revature.util.ConnectionUtil;
import java.sql.Connection;
import java.sql.SQLException;

public class ManagerDAOImpl implements ManagerDAO{

    @Override
    public void filterRequests() {
        try (Connection conn = ConnectionUtil.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void editRequests() {
        try (Connection conn = ConnectionUtil.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
