package com.revature.repos;

import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class CommonDAOImpl implements CommonDAO {

    public CommonDAOImpl() {
    }

    @Override
    public void viewTickets() {
        try (Connection conn = ConnectionUtil.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
