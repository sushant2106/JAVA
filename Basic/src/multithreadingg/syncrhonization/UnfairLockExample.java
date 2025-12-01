package multithreadingg.syncrhonization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairLockExample {
    private final Lock unfairLock=new  ReentrantLock();
    //   unfairLock(Lock)=new ReentrantLock(); by default Lock is Unfair
    //To make it fair which means order wise -> just make ReentrantLock(true) sbko nauka milega to help to reduce starvation
    //jis bhi order mai request kiya ho


    public  void accessResource(){
        unfairLock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " accquired the lock");
            Thread.sleep(1000);
        }
        catch (Exception e){
          Thread.currentThread().interrupt();
        }
        finally {
            System.out.println(Thread.currentThread().getName() +" released the lock ..");
            unfairLock.unlock();

        }
    }

    public static void main(String[] args) {
        UnfairLockExample example=new UnfairLockExample();
        //Here Order are not determine
        Runnable task=new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };
        Thread t1=new Thread(task,"Thread 1");
        Thread t2=new Thread(task,"Thread 2");
        Thread t3=new Thread(task,"Thread 3");

        t1.start();
        t2.start();
        t3.start();



    }

}
