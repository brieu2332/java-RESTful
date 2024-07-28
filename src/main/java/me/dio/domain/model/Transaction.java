package me.dio.domain.model;

import java.util.Date;

public class Transaction {
    private int id;
    private double amount;
    private String type; // DEPOSIT, WITHDRAW, TRANSFER
    private Date date;
    private Account fromAccount;
    private Account toAccount;

    public Transaction(int id, double amount, String type, Date date, Account fromAccount, Account toAccount) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    // Getters and Setters
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Account fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public void setToAccount(Account toAccount) {
        this.toAccount = toAccount;
    }
}
package com.example.santanderdevweek.data.local;

import java.util.Date;

public class Transaction {
    private int id;
    private double amount;
    private String type; // DEPOSIT, WITHDRAW, TRANSFER
    private Date date;
    private Account fromAccount;
    private Account toAccount;

    public Transaction(int id, double amount, String type, Date date, Account fromAccount, Account toAccount) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    // Getters and Setters
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Account fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public void setToAccount(Account toAccount) {
        this.toAccount = toAccount;
    }
}
