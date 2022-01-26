package com.revature.models;

import java.sql.Blob;
import java.util.Objects;

/**
 * This is the reimbursement object
 */
public class Reimb {
    private int id;
    private double amount;
    private String timeSubmitted;
    private String timeResolved;
    private String description;
    private Blob receipt;
    private int author;
    private int resolver;
    private int statusID;
    private int typeID;

    public Reimb() {
    }

    public Reimb(int id, double amount, String timeSubmitted, String timeResolved, String description, Blob receipt,
                 int author, int resolver, int statusID, int typeID) {
        this.id = id;
        this.amount = amount;
        this.timeSubmitted = timeSubmitted;
        this.timeResolved = timeResolved;
        this.description = description;
        this.receipt = receipt;
        this.author = author;
        this.resolver = resolver;
        this.statusID = statusID;
        this.typeID = typeID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTimeSubmitted() {
        return timeSubmitted;
    }

    public void setTimeSubmitted(String timeSubmitted) {
        this.timeSubmitted = timeSubmitted;
    }

    public String getTimeResolved() {
        return timeResolved;
    }

    public void setTimeResolved(String timeResolved) {
        this.timeResolved = timeResolved;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Blob getReceipt() {
        return receipt;
    }

    public void setReceipt(Blob receipt) {
        this.receipt = receipt;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public int getResolver() {
        return resolver;
    }

    public void setResolver(int resolver) {
        this.resolver = resolver;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reimb reimb = (Reimb) o;
        return id == reimb.id && Double.compare(reimb.amount, amount) == 0 && Integer.compare(reimb.author, author) == 0 && Integer.compare(reimb.resolver, resolver) == 0 && statusID == reimb.statusID && typeID == reimb.typeID && Objects.equals(timeSubmitted, reimb.timeSubmitted) && Objects.equals(timeResolved, reimb.timeResolved) && Objects.equals(description, reimb.description) && Objects.equals(receipt, reimb.receipt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, timeSubmitted, timeResolved, description, receipt, author, resolver, statusID, typeID);
    }

    @Override
    public String toString() {
        return "Reimb{" +
                "id=" + id +
                ", amount=" + amount +
                ", timeSubmitted='" + timeSubmitted + '\'' +
                ", timeResolved='" + timeResolved + '\'' +
                ", description='" + description + '\'' +
                ", receipt=" + receipt +
                ", author=" + author +
                ", resolver=" + resolver +
                ", statusID=" + statusID +
                ", typeID=" + typeID +
                '}';
    }
}

