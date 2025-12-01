package multithreadingg.threadmethod;

public class InteruptMethod extends Thread{

    @Override
    public  void run(){
        try {
            Thread.sleep(5000);
            System.out.println("Done sleeping");
        } catch (InterruptedException e) {
            System.out.println("Got interrupted!");
        }

    }
    public static void main(String[] args)throws InterruptedException {

        InteruptMethod t1=new InteruptMethod();
        t1.start();
        System.out.println(t1.getState());

        t1.interrupt();

        Thread.sleep(10);
        System.out.println(t1.getState());






    }

}
