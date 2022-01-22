package com.revature.service;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;


public class Argon2Hasher {

    private static Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);

    public static void main(String... args) {

    }

    static String hash(String password) {
        return argon2.hash(2, 15360, 1, password.toCharArray());
    }

    static boolean verify(String userID, String password) {
        //loginDao will return the stored hashed pw 
        //return argon2.verify(loginDao.login(userID), password.toCharArray());
        return true;
    }
}
