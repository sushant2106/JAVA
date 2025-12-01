package multithreadingg.syncrhonization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {

    private final Lock lock=new ReentrantLock();
    //dobara enter kiya ja sakta hai reentrant
    //jab reentrant use krte hai toh ek count maintina krte hai
    //Ki lock kitni baar acquire kiya gya hai
    //

    public void outerMethod(){
        lock.lock();
        //lock.lockInterruptibly();
        try{
            System.out.println("Outer Method");
            innerMethod();
        }
        finally{
          lock.unlock();
        }

    }
    public  void innerMethod(){
        lock.lock();
        try {
            System.out.println("Inner Method");
        }
        finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantExample  example=new ReentrantExample();
        example.outerMethod();

    }



}
