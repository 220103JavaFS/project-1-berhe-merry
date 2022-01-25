package com.revature.service;

import com.revature.models.EditTicketDTO;
import com.revature.models.Reimb;
import com.revature.repos.EmployeeDAO;
import com.revature.repos.ManagerDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ManagerServiceTest {

    private ManagerService managerService= new ManagerService();
    @Mock
    private ManagerDAO managerDAO;
    private EditTicketDTO editTicketDTO;

    @BeforeEach
    public void setUp(){
        managerDAO = Mockito.mock(ManagerDAO.class);
        editTicketDTO= new EditTicketDTO();
        managerService= new ManagerService(managerDAO);

    }
    @Test
    @DisplayName("Manager Test")
    public void managerSecuss(){
        Mockito.when(managerDAO.editRequests(editTicketDTO)).thenReturn(new Reimb());
        assertNotNull(managerService.editRequests(editTicketDTO));
    }

    @Test
    @DisplayName("Manager Test")
    public void managerFailure(){
        Mockito.when(managerDAO.editRequests(editTicketDTO)).thenReturn(null);
        assertNull(managerService.editRequests(editTicketDTO));
    }

}
