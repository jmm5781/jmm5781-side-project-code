package com.techelevator;

public class CheckingAccount extends BankAccount {
    private static final int CREDIT_LIMIT = 100;
    private static final int OVERDRAFT_FEE = 10;

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }
    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        int balance = getBalance();

        if (amountToWithdraw <= 0) {
            return balance;
        }

        balance -= amountToWithdraw;

        if (balance <= -CREDIT_LIMIT) {
            balance += amountToWithdraw;
            return balance;
        }

        if (balance > -CREDIT_LIMIT && balance < 0) {
            balance -= OVERDRAFT_FEE;
            return balance;
        }

        return balance;

    }
}
