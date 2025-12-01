package test.threadBegin.threadmethod;

public class RUNNABLE implements Runnable {

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) throws InterruptedException {
        RUNNABLE obj=new RUNNABLE();
        Thread t1=new Thread(obj);
        t1.start();
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
        }
        t1.join();

    }

}
