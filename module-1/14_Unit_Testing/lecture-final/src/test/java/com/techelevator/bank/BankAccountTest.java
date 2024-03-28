package com.techelevator.bank;

import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest {

    @Test
    public void transfer_validData_transfersCorrectly() {
        BankAccount account1 = new BankAccount("Yoav", "3uy44875", 100);
        BankAccount account2 = new BankAccount("Linda", "5uy245875", 25);

        int expectedAcct1Balance = 100 - 50;
        int expectedAcct2Balance = 25 + 50;

        account1.transfer(account2, 50);

        int resultBal1 = account1.getBalance();
        int resultBal2 = account2.getBalance();

        Assert.assertEquals(expectedAcct1Balance, resultBal1);
        Assert.assertEquals(expectedAcct2Balance, resultBal2);

    }

    @Test
    public void transfer_validData_returnsCorrectBalance() {
        BankAccount account1 = new BankAccount("Yoav", "3uy44875", 100);
        BankAccount account2 = new BankAccount("Linda", "5uy245875", 25);

        int expectedAcct1Balance = 100 - 50;

        int resultingBal = account1.transfer(account2, 50);

        Assert.assertEquals(expectedAcct1Balance, resultingBal);

    }

    @Test
    public void transfer_amoutnOver500_shouldNotTransfer() {
        BankAccount account1 = new BankAccount("Yoav", "3uy44875", 3000);
        BankAccount account2 = new BankAccount("Linda", "5uy245875", 25);

        int expectedAcct1Balance = account1.getBalance();
        int expectedAcct2Balance = account2.getBalance();

        int resultingBal = account1.transfer(account2, 501);

        Assert.assertEquals(expectedAcct1Balance, account1.getBalance());
        Assert.assertEquals(expectedAcct2Balance, account2.getBalance());

        account1.transfer(account2, 500);
        Assert.assertEquals(2500, account1.getBalance());
        Assert.assertEquals(525, account2.getBalance());

        account1.transfer(account2, 499);
        Assert.assertEquals(2001, account1.getBalance());
        Assert.assertEquals(1024, account2.getBalance());

    }

    @Test
    public void transfer_amountCausesOverdraw_shouldNotTransfer() {
        BankAccount account1 = new BankAccount("Yoav", "3uy44875", 100);
        BankAccount account2 = new BankAccount("Linda", "5uy245875", 25);

        int expectedAcct1Balance = account1.getBalance();
        int expectedAcct2Balance = account2.getBalance();

        int resultingBal = account1.transfer(account2, 499);

        Assert.assertEquals(expectedAcct1Balance, account1.getBalance());
        Assert.assertEquals(expectedAcct2Balance, account2.getBalance());
    }

}
