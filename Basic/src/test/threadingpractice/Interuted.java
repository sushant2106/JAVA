package test.threadingpractice;

public class Interuted  extends Thread{

    @Override
    public void run(){
        System.out.println("Interupted Thread..");
    }

    public static void main(String[] args) throws  InterruptedException{
        Interuted t1=new Interuted();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        t1.join();
        System.out.println("After finish: "+t1.getState());

    }
}
