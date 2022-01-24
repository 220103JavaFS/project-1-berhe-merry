package com.revature.repos;

import com.revature.models.Users;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class LoginDAOImpl implements LoginDAO{

    /**
     * Used by Finance Manager and employee to login
     */
    @Override
    public Users login(String username) {
        try (Connection conn = ConnectionUtil.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
