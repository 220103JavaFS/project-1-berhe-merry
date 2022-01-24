package com.revature.controllers;
import com.revature.models.Reimb;
import com.revature.models.Roles;
import com.revature.service.EmployeeService;
import io.javalin.Javalin;
import io.javalin.http.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * API used by only an Employee
 */
public class EmployeeController extends Controller {
    private EmployeeService service = new EmployeeService();
    private Logger log = LoggerFactory.getLogger(Controller.class);

    /**
     * Adds a request
     * Automatic status will be pending when submitted
     */
    private Handler addRequest = (ctx) -> {
        Reimb reimb = ctx.bodyAsClass(Reimb.class);
        service.addRequest(reimb);

    };

    @Override
    public void addRoutes(Javalin app) {
        app.post("/addRequest", addRequest, Roles.EMPLOYEE);
    }
}
