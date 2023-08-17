package com.cbfacademy.accounts;
import java.util.ArrayList; 


public class Bank {
    public void main(String[] args) {
        ArrayList<Account> accountsList = new ArrayList<>();

    }

    public void openCurrentAccount() {

    }

    public void openSavingsAccount() {

    }

    public void closeSavingsAccount() {

    }

    public void closeCurrentAccount() {

    }

    public void payDividend(){
        double interestEarned = this.balance + getInterest();
    }

}


//    CurrentAccount sarahCurrentAccount = new CurrentAccount(100, 1, 50);
//
//    System.out.println(sarahCurrentAccount.balance);
//    sarahCurrentAccount.deposit(50);
//    System.out.println(sarahCurrentAccount.balance);
//
//
//    }