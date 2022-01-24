package com.revature.service;

import com.revature.models.EditTicketDTO;
import com.revature.models.Reimb;
import com.revature.repos.ManagerDAO;
import com.revature.repos.ManagerDAOImpl;

public class ManagerService {
    private ManagerDAO dao = new ManagerDAOImpl();

    /**
     * Allows a manager to edit a request
     * @param editTicketDTO
     * @return the edited request with updated status
     */
    public Reimb editRequests(EditTicketDTO editTicketDTO){
        dao.editRequests(editTicketDTO);
        return null;
    }
}
