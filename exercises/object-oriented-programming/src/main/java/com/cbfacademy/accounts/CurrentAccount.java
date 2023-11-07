package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(double balance, int accountNumber, double overdraftLimit) {
        super(balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > (this.balance + this.overdraftLimit)) {
            System.out.println("Not enough funds in balance and overdraft.");

        } else if (amount < 0) {

            System.out.println("Cannot withdraw a negative number. Nice try!");
        } else {
            this.balance -= amount;
        }

    }
}
