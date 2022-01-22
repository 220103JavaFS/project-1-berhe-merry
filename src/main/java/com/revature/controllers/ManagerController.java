package com.revature.controllers;

import io.javalin.Javalin;
import io.javalin.http.Handler;

/**
 * API for Manager only controls
 */
public class ManagerController extends Controller{

    /**
     * This method is only used by the Finance Manager to filter requests by status
     * The status will be a queryParam in the URL
     * Valid values for status are PENDING, APPROVED, or DENIED
     */
    private Handler filterRequests = (ctx) -> {
        //System.out.println(ctx.queryParam("status")); //testing
        ctx.queryParam("status");
    };

    /**
     * This method is only used by the Finance Manager to either approve or deny the request
     */
    private Handler editRequest = (ctx) -> {

    };

    @Override
    public void addRoutes(Javalin app) {
        app.get("/filter", filterRequests); //make sure to use query param since that is used for filtering/sorting
        app.patch("/edit", editRequest);
    }
}
