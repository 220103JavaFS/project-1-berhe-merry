package com.revature;
import com.revature.controllers.*;
import io.javalin.Javalin;

public class App {

    private static Javalin app;

    public static void main(String[] args) {

        app = Javalin.create( c -> {
            //c.accessManager(new AccessManagerConfigure());
        }).start();

        configure(new ManagerController());
    }

    public static void configure(Controller... controllers) {
        for(Controller c: controllers){
            c.addRoutes(app);
        }
    }


}