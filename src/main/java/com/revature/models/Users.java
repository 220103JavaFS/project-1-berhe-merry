package com.revature.models;

import java.util.ArrayList;
import java.util.Objects;

public class Users {

    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private int roleID;
    private ArrayList<Reimb> reimbs;

    public Users() {
    }

    public Users(String userName, String firstName, String lastName, String email, int roleID, ArrayList<Reimb> reimbs) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.roleID = roleID;
        this.reimbs = reimbs;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public ArrayList<Reimb> getReimbs() {
        return reimbs;
    }

    public void setReimbs(ArrayList<Reimb> reimbs) {
        this.reimbs = reimbs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return roleID == users.roleID && Objects.equals(userName, users.userName) && Objects.equals(firstName, users.firstName) && Objects.equals(lastName, users.lastName) && Objects.equals(email, users.email) && Objects.equals(reimbs, users.reimbs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, firstName, lastName, email, roleID, reimbs);
    }

    @Override
    public String toString() {
        return "Users{" +
                "userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", roleID=" + roleID + '\'' +
                "Reimbursements=" + reimbs.toString()+
                "}";
    }
}
