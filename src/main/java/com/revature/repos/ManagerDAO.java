package com.revature.repos;

import com.revature.models.EditTicketDTO;
import com.revature.models.Reimb;

public interface ManagerDAO {

    Reimb editRequests(EditTicketDTO editTicketDTO);
}
