package test.threadingpractice;

public class MyThread extends Thread{

    @Override
    public void run(){
        try{
//            for(int i=0;i<5;i++){
//                System.out.println("Thread is runninng " + i + Thread.currentThread().getName());
//            }
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(300);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws  InterruptedException{
        MyThread t1=new MyThread();
        t1.start();
        t1.join();



        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
        }

    }
}
