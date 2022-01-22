package com.revature.controllers;

import com.revature.models.Users;
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

    //TODO:should we use a ReimbDTO since Reimb does not have fields for the dates?
    private Handler viewTickets = (ctx) -> {
        //in ctx it should have the query type: ALL, PENDING, PAST (not Pending)
        int userID = 0; //test
        String role = ""; //test
        String queryType = "ALL"; //test
        //then using either session or jwt, pass on user id, role, and query type to service layer
        //the service layer will return an object...ctx.json(service.viewTickets(userID, role, queryType));
        ctx.json(service.viewTickets(userID, role, queryType));
        ctx.status(200);
    };

    @Override
    public void addRoutes(Javalin app) {
        app.get("/tickets", viewTickets);

    }
}
