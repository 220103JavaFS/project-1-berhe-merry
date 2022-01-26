package com.revature.service;

import com.revature.models.Reimb;
import com.revature.models.TicketQueryDTO;
import com.revature.models.Users;
import com.revature.repos.CommonDAO;
import com.revature.repos.CommonDAOImpl;

import java.util.ArrayList;

public class CommonService<E> {
    private CommonDAO dao;

    public CommonService() {
        dao = new CommonDAOImpl();
    }

    public CommonService(CommonDAO dao) {
        this.dao = dao;
    }

    /**
     * A manager or employee may use this
     * An employee can choose to view all, pending, denied, and approved reimbursements that belongs to the employee.
     * A manager can choose to view all, pending, denied, and approved reimbursements of all employees.
     * The role is checked first, if an employee, send to appropriate doa method
     * else the user is a manager and can query all employees
     * @param ticketQueryDTO
     * @return An arrayList of Reimbursements
     */
    public ArrayList viewTickets(TicketQueryDTO ticketQueryDTO){
        //if(ticketQuery.role.equalsIgnoreCase("employee"))
            //return dao.viewAll(ticketQuery.userID, ticketQuery.queryType); //for an employee
        //else
            //return dao.viewAll(ticketQuery.queryType); //for manager
        return null;
    }

    /**
     * Used by the manager to query tickets for a specific employee. The manager can view all, pending, denied, and
     * approved reimbursements.
     * @param ticketQueryDTO
     * @return an arrayList of Reimbursements
     */
    public ArrayList viewEmployeeTickets(TicketQueryDTO ticketQueryDTO){
        //return dao.viewAll(ticketQuery.userID, ticketQuery.queryType);
        return null;
    }
}
