package com.revature.controllers;
import com.revature.models.UserDTO;
import io.javalin.Javalin;
import io.javalin.http.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * First layer for when a user logs in
 */
public class LoginController extends Controller {

    //private LogonService service = new LogonService();
    private static Logger log = LoggerFactory.getLogger(Controller.class);
    public LoginController(){}

    private Handler login = (ctx) -> {
        UserDTO user = ctx.bodyAsClass(UserDTO.class);
        //log.info("User " + user.username + " is trying to login...");

        //return user info from db, set the role in the session / web token
        //service.login(user);
    };

    private Handler logout = (ctx) -> {
        //log.info("User is attempting to logout...");
        //use session or jwt?
    };

    @Override
    public void addRoutes(Javalin app) {
        app.post("/login", login);
        app.post("/logout", login);
    }
}