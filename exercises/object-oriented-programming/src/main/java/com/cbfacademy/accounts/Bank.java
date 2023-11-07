package com.cbfacademy.accounts;

import java.util.ArrayList;

public class Bank extends Account {

    public Bank(double balance, int accountNumber) {
        super(balance, accountNumber);
        // TODO Auto-generated constructor stub
    }

    ArrayList<Account> accountsList = new ArrayList<>();

    public void main(String[] args) {

    }

    // this method creates a currentaccount and adds it to the arrayList
    public void openCurrentAccount() {
        Account currentAccount = new CurrentAccount(balance, getAccountNumber(), balance);
        accountsList.add(currentAccount);
    }

    // this method creates a savings account and adds it to the arrayList
    public void openSavingsAccount() {
        Account savingsAccount = new SavingsAccount(balance, getAccountNumber(), balance);
        accountsList.add(savingsAccount);
    }

    // this method checks if the accont is a savingsAccount and removes it from the
    // arraylist if it is
    public void closeSavingsAccount() {
        for (Account account : accountsList) {
            if (account instanceof SavingsAccount) {
                accountsList.remove(account);
            }
        }

    }

    // this method checks if the accont is a current Account and removes it from the
    // arraylist if it is
    public void closeCurrentAccount() {
        for (Account account : accountsList) {
            if (account instanceof CurrentAccount) {
                accountsList.remove(account);
            }
        }

    }

    // this method iterates through the list of accounts and checks if an account is
    // a savings or current account
    // if its a savings account we call the getInterest method
    // if its a current account we send a letter if they are in their overdraft

    public void updateAccount() {

        for (int i = 0; i < accountsList.size(); i++) {
            Account account = accountsList.get(i);
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).getInterest();
            } else if (account instanceof CurrentAccount) {
                CurrentAccount currentAccount = (CurrentAccount) account; // Cast to CurrentAccount
                if (currentAccount.getBalance() < 0
                        && currentAccount.getBalance() > (currentAccount.getOverdraftLimit() * -1)) {
                    System.out.println("You are in your overdraft, a letter has been sent");
                }
            }
        }
    }

    // this is a method that adds the interest to the balance for savings accounts
    // if iterates through the accountslist and then adds the interest if the
    // account is a savings account
    public void payDividend() {
        for (Account account : accountsList) {
            if (account instanceof SavingsAccount) {
                SavingsAccount savingsAccount = (SavingsAccount) account;
                double interestEarned = savingsAccount.balance * savingsAccount.getInterest();
                double payDividend = interestEarned + savingsAccount.balance;
                savingsAccount.balance += payDividend;
            }

        }
    }
}
