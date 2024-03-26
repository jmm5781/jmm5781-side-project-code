package com.techelevator;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private int balance;

    public String getAccountHolderName() {
        return accountHolderName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }

    public BankAccount(String accountHolderName, String accountNumber) {}
    public BankAccount(String accountHolderName, String accountNumber, int balance) {
        this.balance = balance;
    }

    public int deposit(int amountToDeposit) {
        if (amountToDeposit <= 0) {
            return balance;
        }
        balance += amountToDeposit;
        return balance;
    }
    public int withdraw(int amountToWithdraw) {
        if (amountToWithdraw <= 0) {
            return balance;
        }
        balance -= amountToWithdraw;
        return balance;
    }
}
