package com.cbfacademy.accounts;

public class Account {
    protected double balance;
    private int accountNumber;

    public Account(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;

    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {

        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("not enough funds in balance.");
        } else if (amount < 0) {
            System.out.println("Cannot withdraw a negative number. Nice try!");
        } else {
            this.balance -= amount;
        }
    }

}