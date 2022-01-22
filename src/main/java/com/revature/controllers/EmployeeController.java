package com.revature.controllers;
import io.javalin.Javalin;
import io.javalin.http.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * API used by only an Employee
 */
public class EmployeeController extends Controller {
    private static Logger log = LoggerFactory.getLogger(Controller.class);

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
