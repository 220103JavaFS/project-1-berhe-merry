package com.revature.service;

import com.revature.models.EditTicketDTO;
import com.revature.models.Reimb;
import com.revature.repos.ManagerDAO;
import com.revature.repos.ManagerDAOImpl;

public class ManagerService {
    private ManagerDAO dao;

    public ManagerService() {
        dao= new ManagerDAOImpl();
    }

    public ManagerService(ManagerDAO dao) {
        this.dao = dao;
    }

    /**
     * Allows a manager to edit a request
     * @param editTicketDTO
     * @return the edited request with updated status
     */
    public Reimb editRequests(EditTicketDTO editTicketDTO){

        Reimb edit= dao.editRequests(editTicketDTO);
        if(edit!=null)
        {
            return edit;
        }
        return null;
    }
}
