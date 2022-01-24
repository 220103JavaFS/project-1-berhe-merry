package com.revature.controllers;

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
        //use a path param
        //in postman
        //http://localhost:8080/edit/:status
        String status = ctx.pathParam("status");
        service.editRequests(status);
    };

    @Override
    public void addRoutes(Javalin app) {
        app.put("/edit/{status}", editRequest, Roles.MANAGER);
    }
}
