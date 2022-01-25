package com.revature.repos;

import com.revature.models.Users;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAOImpl implements LoginDAO{

    /**
     * Used by Finance Manager and employee to login
     */
    @Override
    public Users login(String username) {
        try (Connection conn = ConnectionUtil.getConnection()) {
            String sql = "SELECT * FROM ers_users WHERE ers_username=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            ResultSet result = statement.executeQuery();
            Users user = new Users();
            if(result.next()) {
                user.setUserID(result.getInt("ers_users_id"));
                user.setUserName(result.getString("ers_username"));
                user.setFirstName(result.getString("ers_firstname"));
                user.setLastName(result.getString("ers_lastname"));
                user.setEmail(result.getString("ers_email"));
                user.setSecret(result.getString("ers_password"));
                user.setRoleID(result.getInt("user_role_id"));
            }
            return user;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
