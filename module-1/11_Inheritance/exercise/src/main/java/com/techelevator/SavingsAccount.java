package com.techelevator;

public class SavingsAccount extends BankAccount {

    private static final int SERVICE_CHARGE = 2;
    private static final int MINIMUM_BALANCE = 150;

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }
    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }
    @Override
    public int withdraw(int amountToWithdraw) {
        int balance = getBalance();

        if (amountToWithdraw <= 0) {
            return balance;
        }

        balance -= amountToWithdraw;

        if (balance < SERVICE_CHARGE) {
            balance += amountToWithdraw;
            return balance;
        }

        if (balance < MINIMUM_BALANCE) {
            balance -= SERVICE_CHARGE;
            return balance;
        }

        return balance;

    }
}
