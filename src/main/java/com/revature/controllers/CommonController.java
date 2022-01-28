package com.revature.controllers;

import com.revature.models.Reimb;
import com.revature.models.Roles;
import com.revature.models.TicketQueryDTO;
import com.revature.service.CommonService;
import io.javalin.Javalin;
import io.javalin.http.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;


/**
 * API of common paths used by both Employee and Finance Manager
 */
public class CommonController extends Controller {
    private Logger log = LoggerFactory.getLogger(Controller.class);
    private CommonService service = new CommonService();

    /**
     * For an employee to view their past ticket, the request will need to contain their user ID, queryType (ALL,
     * PENDING, APPROVED, DENIED) and role (EMPLOYEE - for the AccessManager)
     * These values will be stored in a DTO object
     */
    private Handler viewTickets = (ctx) -> {
        if(ctx.req.getSession(false)!=null) {
            TicketQueryDTO ticketQueryDTO = ctx.bodyAsClass(TicketQueryDTO.class);
            ArrayList<Reimb> reimbs = null;
            String role = (String) ctx.req.getSession().getAttribute("Role");

            if ((role.equalsIgnoreCase("manager") && ticketQueryDTO.userID != -1) || role.equalsIgnoreCase("employee")) {
                reimbs = service.viewTickets(ticketQueryDTO, role);
            } else {
                reimbs = service.viewTickets(ticketQueryDTO);
            }

            if (reimbs == null) {
                ctx.status(400);
            } else {
                ctx.status(200);
            }
        } else {
            ctx.status(401);
        }
    };

    @Override
    public void addRoutes(Javalin app) {
        app.get("/tickets", viewTickets, Roles.MANAGER, Roles.EMPLOYEE);


    }
}
