package com.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("WELCOME TO OUR ATM!");
            System.out.println("Choose 1 to login");
            System.out.println("Choose 2 for new account");
            System.out.println("Choose 3 for Exit");
            System.out.print("Choose the operation you want to perform:");

            //get choice from user
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter your account number:");
                    int number = sc.nextInt();
                    if(bank.getAccount(number) == null){
                        System.out.println("No account found. Create a new account");
                        break;
                    }
                    else{
                        Account account = bank.getAccount(number);
                        bankMenu(account);
                    }
                case 2:
                    System.out.print("Enter your desired account number, 4 digits:");
                    int accountNumber = sc.nextInt();
                    Account newAccount = new Account(accountNumber);
                    bank.addAccount(newAccount);
                    bankMenu(newAccount);
                    break;
                case 3:
                    System.out.println("Have a great day!");
                    break;
                default:
                    break;



            }
        }
    }
    public static void bankMenu(Account account) {
        ATM atm = new ATM(account);
        boolean loggedIn = true;
        while(loggedIn == true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("How much do you want to withdraw?:");
                    int wAmount = sc.nextInt();
                    atm.withdraw(wAmount);
                    break;

                case 2:
                    System.out.print("How much do you want to deposit?:");
                    int dAmount = sc.nextInt();
                    atm.deposit(dAmount);
                    break;
                case 3:
                    System.out.println("Your balance: " + atm.checkBalance());
                    break;
                default:
                    loggedIn=false;
                    break;


            }
        }


    }
}
