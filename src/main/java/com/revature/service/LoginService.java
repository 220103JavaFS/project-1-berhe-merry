package com.revature.service;

import com.revature.models.UserDTO;
import com.revature.models.Users;
import com.revature.repos.LoginDAO;
import com.revature.repos.LoginDAOImpl;

public class LoginService {

    //private LoginDAO dao = new LoginDAOImpl();
    private LoginDAO dao;

    public LoginService() {
    }

    public LoginService(LoginDAO dao) {
        this.dao = dao;
    }

    /**
     * Called by controller layer, takes a username and password.
     * This method will call to the dao layer using the username to grab user information
     * Then the hashed pw is compared with the inputted (validated) pw using Argon2Hasher
     * If they match, the User's information is returned
     * @param user inputted username
     * @return valid User in database else empty user
     */
    public Users login(UserDTO user){
        Users userOut = dao.login(user.username);
        if(userOut != null) {
            if (Argon2Hasher.verify(userOut.getSecret(), user.password)) {
                return userOut;
            }
        }
        return null;
    }
}
