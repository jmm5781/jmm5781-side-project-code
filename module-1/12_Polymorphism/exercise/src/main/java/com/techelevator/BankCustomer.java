package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();
    private static final int MINIMUM_VIP_COMBINED_BALANCE = 25_000;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Accountable[] getAccounts() {
        Accountable[] accountsArray = new Accountable[accounts.size()];
        for (int i = 0; i < accountsArray.length; i++) {
            accountsArray[i] = accounts.get(i);
        }
        return accountsArray;
    }
    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }
    public boolean isVip() {
        int sum = 0;
        for (Accountable account : accounts) {
            sum += account.getBalance();
        }
        return sum >= MINIMUM_VIP_COMBINED_BALANCE;
    }
}
