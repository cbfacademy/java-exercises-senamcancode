package com.cbfacademy.accounts;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double balance, int accountNumber, double interestRate) {
        super(balance, accountNumber);

        this.interestRate = interestRate;
    }

    public void addInterestRate() {
        double interest = this.balance * (interestRate/ 100);
        this.balance += interest;
    }

    public double getInterest(){
        double interest = this.balance * (interestRate / 100);
        return interest; 
    }

}

// final static private double INTEREST_PERCENTAGE = 6.7;
//
// public SavingsAccount(double balance, int accountNumber) {
// super(balance, accountNumber);
// }
//
// public void addInterest() {
// double interestAmount = this.balance * (INTEREST_PERCENTAGE / 100);
// this.balance = this.balance + interestAmount;
//
// }
//
// public double getInterestRate() {
// return INTEREST_PERCENTAGE;
// }

// }
