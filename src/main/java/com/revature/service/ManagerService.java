package com.revature.service;

import com.revature.exceptions.MyException;
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
        try {
            Validator.isValidUserId(editTicketDTO.reimbID);
            //Validator.isValidType(editTicketDTO.status); //TODO
            Reimb edit = dao.editRequests(editTicketDTO);
            if (edit != null) {
                return edit;
            }
            return null;
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
