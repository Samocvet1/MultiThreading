package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account("1",100);
        Account account2 = new Account("2",100);

        ExampleThread thread1 = new ExampleThread(account);
        thread1.setName("First");
        ExampleThread thread2= new ExampleThread(account);
        thread2.setName("Second");
        ExampleThread thread3 = new ExampleThread(account);
        thread3.setName("Third");

        ExampleThread thread1_0 = new ExampleThread(account2);
        thread1_0.setName("Fourth");
        ExampleThread thread2_0 = new ExampleThread(account2);
        thread2_0.setName("Fifth");
        ExampleThread thread3_0 = new ExampleThread(account2);
        thread3_0.setName("Sixth");

        thread1.start();
        thread2.start();
        thread3.start();

        Thread.sleep(2000);

        thread1_0.start();
        thread2_0.start();
        thread3_0.start();

        System.out.println("Баланс счета: "+account.getAccountNumber()+" составляет: " + account.getBalance());
        System.out.println("Баланс счета: "+account2.getAccountNumber()+" составляет: " + account2.getBalance());
    }
}
