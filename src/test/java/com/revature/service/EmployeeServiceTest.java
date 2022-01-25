package com.revature.service;

import com.revature.models.Reimb;
import com.revature.models.UserDTO;
import com.revature.models.Users;
import com.revature.repos.EmployeeDAO;
import com.revature.repos.EmployeeDAOImpl;
import com.revature.repos.LoginDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeServiceTest {
    private EmployeeService employeeTest;

    @Mock
    private EmployeeDAO mockedDAO;
    private Reimb testReimb;


    @BeforeEach
    public void setUp() {
        mockedDAO = Mockito.mock(EmployeeDAO.class);
       testReimb= new Reimb();
        employeeTest = new EmployeeService(mockedDAO);
    }
@Test
    @DisplayName("Employee Test")
    public void employeeFailur(){
        Mockito.when(mockedDAO.addRequest(testReimb)).thenReturn(null);
        assertNull(employeeTest.addRequest(testReimb));
}
    @Test
    @DisplayName("Employee Test")
    public void employeeSeccuss(){
        Mockito.when(mockedDAO.addRequest(testReimb)).thenReturn(new Reimb());
        assertNotNull(employeeTest.addRequest(testReimb));
    }

}
