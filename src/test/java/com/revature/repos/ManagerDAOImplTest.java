package com.revature.repos;

import com.revature.models.EditTicketDTO;
import com.revature.models.Reimb;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Blob;

public class ManagerDAOImplTest {
    private ManagerDAO managerDAO = new ManagerDAOImpl();
    private EditTicketDTO editTicketDTO;


    @Test
    @DisplayName("Manager is able to successfully edit a reimbursement, will return a Reimb")
    void editTestSuccess(){
        managerDAO.editRequests(editTicketDTO);
    }

}
