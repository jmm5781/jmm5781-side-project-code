package com.techelevator.challenge;

import java.math.BigDecimal;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    // **** Need to figure out the best way to do this without
    // **** making BankAccount's balance property protected (vs. private)
    // **** ... or maybe protected is fine.
    protected BigDecimal balance;

    public String getAccountHolderName() {
        return accountHolderName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public BigDecimal getBalance() {
        return balance;
    }

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }
    public BankAccount(String accountHolderName, String accountNumber, BigDecimal balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BigDecimal deposit(BigDecimal amountToDeposit) {

        if (amountToDeposit.compareTo(BigDecimal.ZERO) <= 0) {
            return balance;
        }

        balance = balance.add(balance);
        return balance;
    }

    public BigDecimal withdraw(BigDecimal amountToWithdraw) {
        if (amountToWithdraw.compareTo(BigDecimal.ZERO) <= 0) {
            return balance;
        }
//      balance -= amountToWithdraw;
        balance = balance.subtract(amountToWithdraw);
        return balance;
    }
}
