package com.revature.repos;

import com.revature.models.Reimb;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.postgresql.util.PSQLException;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeDAOImplTest {

    private  EmployeeDAO employeeDAO=new EmployeeDAOImpl();
    private Reimb reimb;

    @Test
    @DisplayName("Employee Implementation Testing, when a user successfully adds a reimbursement request")
    public void EmployeeSuccess(){
        reimb = new Reimb();
        reimb.setAmount(400.02);
        reimb.setAuthor(1);
        //reimb.setTypeID(1);
        assertNotNull(employeeDAO.addRequest(reimb));
    }


}
