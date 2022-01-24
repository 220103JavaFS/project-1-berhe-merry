package com.revature.service;

import com.revature.exceptions.MyException;

/**
 * Utility class used to implement server-side validation of user input
 */
final class Validator {
    private static String pattern;
    public Validator(){}

    private static boolean isEmpty(String input){
        input = input.trim();
        if(input == null || input.trim() == "") {
            return true;
        }
        return false;
    }

    static boolean isValidName(String name) {
        if(isEmpty(name)) {
            throw new MyException("No name provided");
        }
        pattern = "[A-Za-z]{3,20} [A-Za-z]{3,20}";
        if(!name.matches(pattern)) {
            throw new MyException("Invalid Name entry.");
        }
        return true;
    }

    static boolean isValidEmail(String email) {
        if(isEmpty(email)) {
            throw new MyException("No email provided");
        }
        pattern = "[A-Za-z]{1,32}([A-Za-z]|[0-9]){0,32}@[A-Za-z]{1,121}([A-Za-z]|[0-9]){0,121}.[a-z]{3}";
        if(!email.matches(pattern)){
            throw new MyException("Invalid email entry.");
        }
        return true;
    }

    public static boolean isValidUserId(String userId) {
        if(isEmpty(userId)) {
            throw new MyException("No userId provided");
        }
        return true;
    }
    public static boolean isValidSecret(String secret) {
        if(isEmpty(secret)) {
            throw new MyException("No password provided");
        }
        return true;
    }

    public static boolean isValidType(String type) {
        if(type == null || type.trim()==""){
            throw new MyException("No reimbursement type provided");
        }
        Reimb_Types[] types = Reimb_Types.values();
        boolean isInTypes = false;
        for (Reimb_Types t: types) {
            if(type.equalsIgnoreCase(t.toString())){
                isInTypes = true;
            }
        }
        if(isInTypes) return true;
        else throw new MyException("Invalid reimbursement type provided");
    }

    public static boolean isValidAmount(int amount) {
        if(amount > 0) {
            return true;
        }
        else {
            throw new MyException("Invalid amount provided");
        }
    }

    public static boolean isValidReimbID(int reimbID){
        if(reimbID >= 0) {
            return true;
        }
        else {
            throw new MyException("Invalid reimbursement ID provided");
        }
    }

}
