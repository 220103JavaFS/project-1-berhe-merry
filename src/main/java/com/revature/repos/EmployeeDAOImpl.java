package com.revature.repos;

import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class EmployeeDAOImpl implements EmployeeDAO{

    @Override
    public void addRequest() {
        try (Connection conn = ConnectionUtil.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
