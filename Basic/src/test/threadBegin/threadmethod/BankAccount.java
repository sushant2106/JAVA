package test.threadBegin.threadmethod;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public  class BankAccount {

    private int balance=100;
    private final Lock lock= new ReentrantLock();
    public  void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + "attempting to withdraw" + amount);


        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " Insufficient Balance " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                        ;


                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " couldn't acquire the lock will try later");
                }
            }
           }
       catch(Exception e){
                Thread.currentThread().interrupt();
                //  throw new RuntimeException(e);
            }

        }


    public static void main(String[] args) {
        BankAccount sbi=new BankAccount();
        Runnable task=new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(40);
            }
        };

        Thread task1=new Thread(task,"Thread 1");
        Thread task2=new Thread(task,"Thread 2");
        task1.start();
        task2.start();


    }
}
