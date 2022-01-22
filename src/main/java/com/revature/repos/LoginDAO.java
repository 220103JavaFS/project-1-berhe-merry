package com.revature.repos;

import com.revature.models.UserDTO;
import com.revature.models.Users;

public interface LoginDAO {
    Users login(String username);
}
