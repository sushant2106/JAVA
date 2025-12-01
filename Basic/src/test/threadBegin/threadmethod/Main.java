package test.threadBegin.threadmethod;


public class Main extends Thread{

   @Override
   public  void run(){
       for(int i=0;i<10;i++){
           System.out.println(Thread.currentThread().getName());
       }
   }
    public static void main(String[] args) throws InterruptedException {
       Main thread1=new Main();
       thread1.start();
       System.out.println(thread1.getState());
       for (int i=0;i<10;i++){
           System.out.println(Thread.currentThread().getName());
       }
       thread1.join();
        //System.out.println(thread1.getState());



    }
}
