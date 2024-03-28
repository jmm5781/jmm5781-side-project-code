package com.techelevator.bank;

public class BankAccount {

    private String accountHolderName;
    private String accountNumber;
    private int balance;

    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public BankAccount(String accountHolder, String accountNumber, int balance) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int deposit(int amountToDeposit) {
        if (amountToDeposit > 0) {
            balance = balance + amountToDeposit;
        }
        return balance;
    }

    public int withdraw(int amountToWithdraw) {
        if (amountToWithdraw > 0) {
            balance = balance - amountToWithdraw;
        }
        return balance;
    }


    public int transfer(BankAccount accountTo, int amountToTransfer) {
        int resultAmount = balance - amountToTransfer;
        if (amountToTransfer <= 500 && resultAmount >= 0) {
            withdraw(amountToTransfer);
            accountTo.deposit(amountToTransfer);
        }
        return balance;
    }

}
