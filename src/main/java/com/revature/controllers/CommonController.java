package com.revature.controllers;

import com.revature.service.CommonService;
import io.javalin.Javalin;
import io.javalin.http.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * API of common paths used by both Employee and Finance Manager
 */
public class CommonController extends Controller {
    private static Logger log = LoggerFactory.getLogger(Controller.class);
    private CommonService service = new CommonService();

    //TODO:should we use a ReimbDTO since Reimb does not have fields for the dates?
    private Handler viewTickets = (ctx) -> {

    };

    @Override
    public void addRoutes(Javalin app) {

        app.get("/tickets", viewTickets);
        //another app.get("/tickets...", viewTickets);?

    }
}
