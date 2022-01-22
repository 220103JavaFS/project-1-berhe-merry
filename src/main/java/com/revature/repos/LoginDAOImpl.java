package com.revature.repos;

import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class LoginDAOImpl implements LoginDAO{


    @Override
    public void login() {
        try (Connection conn = ConnectionUtil.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
