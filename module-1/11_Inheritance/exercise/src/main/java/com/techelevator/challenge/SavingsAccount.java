package com.techelevator.challenge;

import java.math.BigDecimal;

public class SavingsAccount extends BankAccount {

    private static final BigDecimal SERVICE_CHARGE = BigDecimal.valueOf(2);
    private static final BigDecimal MINIMUM_BALANCE = BigDecimal.valueOf(150);

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }
    public SavingsAccount(String accountHolderName, String accountNumber, BigDecimal balance) {
        super(accountHolderName, accountNumber, balance);
    }
    @Override
    public BigDecimal withdraw(BigDecimal amountToWithdraw) {

//        if (amountToWithdraw <= 0) {
        if (amountToWithdraw.compareTo(BigDecimal.ZERO) <= 0) {
            return balance;
        }

//        balance -= amountToWithdraw;
        balance = balance.subtract(amountToWithdraw);

//        if (balance < SERVICE_CHARGE) {
        if (balance.compareTo(SERVICE_CHARGE) < 0) {
//            balance += amountToWithdraw;
            balance = balance.add(amountToWithdraw);
            return balance;
        }

//        if (balance < MINIMUM_BALANCE) {
        if (balance.compareTo(MINIMUM_BALANCE) < 0) {
//            balance -= SERVICE_CHARGE;
            balance = balance.subtract(SERVICE_CHARGE);
            return balance;
        }

        return balance;

    }
}
