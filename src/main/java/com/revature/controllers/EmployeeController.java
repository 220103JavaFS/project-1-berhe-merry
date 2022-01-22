package com.revature.controllers;
import io.javalin.Javalin;
import io.javalin.http.Handler;

/**
 * API used by only an Employee
 */
public class EmployeeController extends Controller {

    /**
     * Adds a request
     * Automatic status will be pending when submitted
     */
    private Handler addRequest = (ctx) -> {

    };

    @Override
    public void addRoutes(Javalin app) {
        app.post("/addRequest", addRequest);
    }
}
