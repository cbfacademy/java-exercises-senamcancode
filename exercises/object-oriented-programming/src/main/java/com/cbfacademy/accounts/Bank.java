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

    public void openCurrentAccount() {
        Account currentAccount = new CurrentAccount(balance, getAccountNumber(), balance);
        accountsList.add(currentAccount);
    }

    public void openSavingsAccount() {
        Account savingsAccount = new SavingsAccount(balance, getAccountNumber(), balance);
        accountsList.add(savingsAccount);
    }

    public void closeSavingsAccount() {
        for (Account account : accountsList) {
            if (account instanceof SavingsAccount) {
                accountsList.remove(account);
            }
        }

    }

    public void closeCurrentAccount() {
        for (Account account : accountsList) {
            if (account instanceof CurrentAccount) {
                accountsList.remove(account);
            }
        }

    }

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
