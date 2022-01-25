package com.revature.service;

import com.revature.models.Reimb;
import com.revature.repos.EmployeeDAO;
import com.revature.repos.EmployeeDAOImpl;

public class EmployeeService {
    //private EmployeeDAO dao = new EmployeeDAOImpl();

private  EmployeeDAO empDAO;
    public EmployeeService() {
        empDAO=new EmployeeDAOImpl();
    }

    public EmployeeService(EmployeeDAO empDAO) {
        this.empDAO = empDAO;
    }

    /**
     * used by the Employee to submit a request for reimbursement
     * @param reimb
     * @return the Reimb if successfully added, else null
     */
    public Reimb addRequest(Reimb reimb){
        //can use Validator
       Reimb rr=empDAO.addRequest(reimb);
       if(rr==null) {
           return  null;
       }
        return rr;
    }
}
