package test.threadBegin.threadmethod;

import multithreadingg.threadmethod.ThreadPrioroty;

public class MyDeamon  extends  Thread{

    public  MyDeamon(String name){
        super(name);
    }
    @Override
    public void run(){
//        while(true){
//            System.out.println(Thread.currentThread().getName());
//        }
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName() + i);
            Thread.yield();
        }
    }
    public static void main(String[] args) {
       MyDeamon t1=new MyDeamon("T1 DEMON");
       MyDeamon t2=new MyDeamon("T2 DEAMON");
//       t1.setDaemon(true);
        t1.start();
        t2.start();

    }
}
