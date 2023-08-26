package com.cbfacademy.accounts;

import java.util.ArrayList;

public class Bank extends Account {

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

    public void updateAccount(){
        ArrayList<Account> accountsList = new ArrayList<>();
        for (int i = 0; i < accountsList.size(); i++){
            if(Account instanceof SavingsAccount){
                getInterest(); 
            }
        }
    
    }

    // public void payDividend(){
    //     double interestEarned = this.balance + getInterest();}
 }



// ArrayList<Account> accounts = new ArrayList<>();
//
// public void openSavingsAccount() {
// accounts.add(new SavingsAccount(0,0));
// }
//
// public void openCurrentAccount() {
// accounts.add(new CurrentAccount(0, 0, 500));
// }
//
// public double getInterest(){
// return INTEREST_PERCENTAGE;
// }
//
// public void update() {
//
// for (int i = 0; i < accounts.size(); i++){
//
// if (account instanceOf SavingsAccount) {
// getInterest()
// }
//
// else if( account at index i == CurrentAccount )
//
//
//
// }
// }
