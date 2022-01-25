package com.revature.repos;

import com.revature.models.Reimb;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EmployeeDAOImplTest {

    private  EmployeeDAO employeeDAO=new EmployeeDAOImpl();
    private Reimb reimb;
    @Test
    @DisplayName("Employee Implmentation Testing")
    public void EmployeeSeccuss(){
       // employeeDAO.addRequest(reimb);
        assertNotNull(employeeDAO.addRequest(reimb));

    }


}
