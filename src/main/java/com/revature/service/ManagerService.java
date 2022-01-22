package com.revature.service;

import com.revature.repos.ManagerDAO;
import com.revature.repos.ManagerDAOImpl;

public class ManagerService {
    private ManagerDAO dao = new ManagerDAOImpl();

    /**
     * Allows a manager to edit a request
     * @param status is either APPROVE or DENY
     */
    public void editRequests(String status){}
}
