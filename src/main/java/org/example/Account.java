package org.example;

import java.util.Random;

public class Account {
    private String accountNumber;
    private int balance;

    public Account() {
    }

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    Random random = new Random();

    public void open(){
        int amount = random.nextInt(100);
        this.setBalance(this.getBalance()+amount);
        System.out.println("Баланс пополнен на сумму: " + amount);
    }

    public void close(){
        int amount = random.nextInt(100);

        if(this.balance > amount){
            setBalance(this.getBalance()-amount);
            System.out.println("С баланса было снята сумма: " + amount);
        }else{
            System.out.println("Снятие денег невозможно!");
        }
    }
}
