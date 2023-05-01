package org.example;

import java.util.Random;

public class ExampleThread extends Thread {
    private Account account;

    public ExampleThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        Random random = new Random();
        int method = random.nextInt(2);
        if (method == 1) {
            this.account.open();
            System.out.println(this.getName());
        } else{
            this.account.close();
            System.out.println(this.getName());
        }
    }
}