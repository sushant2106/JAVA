package multithreadingg.threadmethod;

public class ThreadPrioroty extends Thread{
   public ThreadPrioroty(String name){
       super(name);
   }


    @Override
    public void run(){
        for(int i=0;i<5;i++){
            String a="";
            for(int j=0;j<100000000;j++){
                a+=a;

            }
            System.out.println(Thread.currentThread().getName() + "-Priority:" + Thread.currentThread().getPriority() +"-count"+i);
            try{
                Thread.sleep(100);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {

        ThreadPrioroty l=new ThreadPrioroty("Low Priority Thread");
        ThreadPrioroty m=new ThreadPrioroty("Medium Priority Thread");
        ThreadPrioroty h=new ThreadPrioroty("High Priority Thread");

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);

        l.start();
        m.start();
        h.start();



    }
}
