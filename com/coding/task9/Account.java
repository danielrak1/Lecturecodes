package com.coding.task9;

import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;

    private Date dateCreated;

    public Account() {
        this(0, 0.0);
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (getAnnualInterestRate() / 12);
    }

    public double getMonthlyInterest() {
        return (getBalance() * getMonthlyInterestRate());
    }

    public void withdraw(double amountToWithdraw) {
        setBalance(getBalance() - amountToWithdraw);
    }

    public void deposit(double amountToDeposit) {
        setBalance(getBalance() + amountToDeposit);
    }

    @Override
    public String toString() {
        return "balance: " + getBalance()+ "\nmonthly interest :"
                + getMonthlyInterest() + "\ndate created: " + dateCreated;
    }
}

