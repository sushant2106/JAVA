package test.threadingpractice;

public class MyDeamon  extends Thread{

    @Override
    public void run(){

        while(true){
            System.out.println("Daemon running..."+Thread.currentThread().getName());
        }

    }
    public static void main(String[] args)throws InterruptedException {
        MyDeamon d=new MyDeamon();
        d.setDaemon(true);
        d.start();

        MyDeamon t2=new MyDeamon();
        t2.start();
        t2.join();

        System.out.println("Main finished");

    }
}
