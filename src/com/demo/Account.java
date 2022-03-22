package com.demo;

public class Account {
    private int accountNum;
    private int balance;

    public Account(int accountNum) {
        this.accountNum = accountNum;
        this.balance = 0;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setBalance(int balance) {
        this.balance =+ balance;
    }

    public int getBalance() {
        return balance;
    }

}
