package com.revature.controllers;

import com.revature.models.EditTicketDTO;
import com.revature.models.Reimb;
import com.revature.models.Roles;
import com.revature.service.ManagerService;
import io.javalin.Javalin;
import io.javalin.http.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * API for Manager only controls
 */
public class ManagerController extends Controller{
    private ManagerService service = new ManagerService();
    private Logger log = LoggerFactory.getLogger(Controller.class);

    /**
     * This method is only used by the Finance Manager to either approve or deny the request
     */
    private Handler editRequest = (ctx) -> {
        if(ctx.req.getSession(false)!=null) {
            EditTicketDTO editTicketDTO = ctx.bodyAsClass(EditTicketDTO.class);
            editTicketDTO.resolverID = (int) ctx.req.getSession().getAttribute("UserID");
            Reimb reimb;
            reimb = service.editRequests(editTicketDTO);
            if (reimb == null) {
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
        app.put("/edit", editRequest, Roles.MANAGER);
    }
}
