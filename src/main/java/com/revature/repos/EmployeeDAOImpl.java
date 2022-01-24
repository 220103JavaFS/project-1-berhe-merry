package com.revature.repos;

import com.revature.models.Reimb;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class EmployeeDAOImpl implements EmployeeDAO{

    /**
     * Method that will allow an employee to add a new request
     * this should set the time of the request and set the statusID to Pending as the default
     */
    @Override
    public Reimb addRequest(Reimb reimb) {
        try (Connection conn = ConnectionUtil.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
