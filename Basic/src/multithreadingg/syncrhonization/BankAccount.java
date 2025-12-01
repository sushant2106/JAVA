package multithreadingg.syncrhonization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance=100;

    private final Lock  lock=new ReentrantLock();//implement lock interface


    //public synchronized  void withdraw(int amount)
    public   void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + "attempting to withdraw" + amount);
        if(balance>=amount){
            System.out.println(Thread.currentThread().getName()+" proceeding with withdrawal");
             try {
                 Thread.sleep(3000);
             }
             catch (Exception e){

             }
             balance-=amount;
            System.out.println(Thread.currentThread().getName() +" Insufficient Balance " + balance);

        }
        else{
            System.out.println(Thread.currentThread().getName() +" Insufficent Balance");
        }
    }


}
