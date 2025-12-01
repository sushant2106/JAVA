package multithreadingg.threadmethod;

public class MyDeamon extends Thread{

    @Override
    public  void run(){
     while(true){
         System.out.println("Hello World!!");
     }
    }
    public static void main(String[] args) {
        MyDeamon mythread=new MyDeamon();//user thread
        mythread.setDaemon(true);
        MyDeamon t1=new MyDeamon();
        t1.start();
        mythread.start();
        System.out.println("Main Done");
     //Deamon thread runs in background


    }
}
