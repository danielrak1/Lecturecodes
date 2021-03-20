package com.coding.task9;

/*
  - A private int data field named id for the account (default 0).
  - A private double data field named balance for the account (default 0).
  - A private double data field named annualInterestRate that stores the
    current interest rate (default 0). Assume all accounts have the same
    interest rate.
  - A private Date data field named dateCreated that stores the date when the
    account was created.
  - A no-arg constructor that creates a default account.
  - A constructor that creates an account with the specified id and initial
    balance.
    */

import com.coding.quizes.A;

public class Main9 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20_000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println(account);

    }


}
