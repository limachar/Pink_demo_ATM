package com.demo;

import java.util.ArrayList;

public class Bank {

    ArrayList<Account> listOfAccounts = new ArrayList<Account>();

    public void addAccount(Account account){
        listOfAccounts.add(account);
    }

    public Account getAccount(int number) {
        for (Account account : listOfAccounts) {
            if( account.getAccountNum() == number){
                return account;
            }
            else return null;
        }
        return null;
    }

}
