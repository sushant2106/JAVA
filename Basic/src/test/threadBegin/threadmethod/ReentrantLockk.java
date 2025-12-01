package test.threadBegin.threadmethod;

import multithreadingg.syncrhonization.ReentrantExample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockk {
    private final Lock lock=new ReentrantLock();

    public void OuterMethod(){
        lock.lock();
        try{
            System.out.println("OuterMethod..");
            innerMethod();
        }
        finally {
            lock.unlock();
        }
    }
    public void innerMethod(){
        lock.lock();
        try{
            System.out.println("InnerMethod ...");

        }
        finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        ReentrantExample obj=new ReentrantExample();
        obj.outerMethod();

    }
}
