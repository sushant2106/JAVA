package multithreadingg.mythread;

public class A extends  B implements  Runnable{

    @Override
    public  void run(){
        System.out.println("This is Runnable implementation of Thread");

    }
}
