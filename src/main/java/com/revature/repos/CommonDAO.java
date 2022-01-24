package com.revature.repos;

import com.revature.models.Reimb;
import com.revature.models.Users;

import java.util.ArrayList;

public interface CommonDAO {

    ArrayList<Reimb> viewAll(int userID, String queryType);
    ArrayList<Users> viewAll(String queryType);
}
