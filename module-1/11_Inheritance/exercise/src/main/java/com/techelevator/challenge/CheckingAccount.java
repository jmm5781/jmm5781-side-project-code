package com.techelevator.challenge;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CheckingAccount extends BankAccount {
    private static final BigDecimal CREDIT_LIMIT = BigDecimal.valueOf(100);
    private static final BigDecimal OVERDRAFT_FEE = BigDecimal.valueOf(10);

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }
    public CheckingAccount(String accountHolderName, String accountNumber, BigDecimal balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public BigDecimal withdraw(BigDecimal amountToWithdraw) {

        if (amountToWithdraw.compareTo(BigDecimal.ZERO) <= 0) {
            return balance;
        }

//        balance -= amountToWithdraw;
        balance = balance.subtract(amountToWithdraw);

//        if (balance <= -CREDIT_LIMIT) {
        if (CREDIT_LIMIT.compareTo(balance) > 0) {
//            balance += amountToWithdraw;
        balance = balance.subtract(amountToWithdraw);
            return balance;
        }

//        if (balance > -CREDIT_LIMIT && balance < 0) {
        if (CREDIT_LIMIT.compareTo(balance) > 0 && balance.compareTo(BigDecimal.ZERO) < 0) {
//            balance -= OVERDRAFT_FEE;
            balance = balance.subtract(OVERDRAFT_FEE);
            return balance;
        }

        return balance;

    }
}
