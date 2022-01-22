package com.revature.service;

import com.revature.models.Reimb;
import com.revature.models.Users;
import com.revature.repos.CommonDAO;
import com.revature.repos.CommonDAOImpl;

import java.util.ArrayList;

public class CommonService<E> {
    private CommonDAO dao = new CommonDAOImpl();
    /**
     * A manager or employee may use this
     * The role is checked first, if an employee, send to appropriate doa method
     * else the user is a manager and can query all employees
     * @param userID
     * @param role
     * @param queryType
     * @return
     */
    public ArrayList viewTickets(int userID, String role, String queryType){
        //if(role.equalsIgnoreCase("employee"))
            //return dao.viewAll(userID, queryType); //for an employee
        //else
            //return dao.viewAll(queryType); //for manager
        return new ArrayList<>();
    }
}
