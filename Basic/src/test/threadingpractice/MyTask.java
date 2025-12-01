package test.threadingpractice;

public class MyTask implements Runnable{

    @Override
    public  void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread is Runnable "+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        MyTask mytask=new MyTask();
        Thread t1=new Thread(mytask);
        System.out.println(t1.getState());
        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }


    }
}
