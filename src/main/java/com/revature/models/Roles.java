package com.revature.models;

import io.javalin.core.security.RouteRole;

public enum Roles implements RouteRole {
    EMPLOYEE,
    MANAGER
}
