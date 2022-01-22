package com.revature.controllers;

import io.javalin.Javalin;
import io.javalin.http.Handler;

/**
 * API of common paths used by both Employee and Finance Manager
 */
public class CommonController extends Controller {

    private Handler viewTickets = (ctx) -> {

    };

    @Override
    public void addRoutes(Javalin app) {

        app.get("/tickets", viewTickets);
        //another app.get("/tickets...", viewTickets);?

    }
}
