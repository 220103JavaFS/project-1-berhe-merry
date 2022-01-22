package com.revature.controllers;

import io.javalin.Javalin;
import io.javalin.http.Handler;

/**
 * API of common paths used by both Employee and Finance Manager
 */
public class CommonController extends Controller {

    //TODO:should we use a ReimbDTO since Reimb does not have fields for the dates?
    private Handler viewTickets = (ctx) -> {

    };

    @Override
    public void addRoutes(Javalin app) {

        app.get("/tickets", viewTickets);
        //another app.get("/tickets...", viewTickets);?

    }
}
