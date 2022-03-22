package com.demo;

public class ATM {

    Account account;

    public ATM(Account account) {
        this.account = account;
    }

    public void deposit(int amount){
        account.setBalance(account.getBalance() + amount);
    }

    public void withdraw(int amount){
        account.setBalance(account.getBalance() - amount);
        System.out.println("You successfully withdrew: " + amount);
    }

    public int checkBalance(){
        return account.getBalance();
    }
}
