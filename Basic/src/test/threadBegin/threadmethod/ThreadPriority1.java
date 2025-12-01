package test.threadBegin.threadmethod;



public class ThreadPriority1 extends Thread{

    public ThreadPriority1(String name){
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
        ThreadPrioroty1 l=new ThreadPrioroty1("Low Priority Thread");
        ThreadPrioroty1 m=new ThreadPrioroty1("Medium Priority Thread");
        ThreadPrioroty1 h=new ThreadPrioroty1("High Priority Thread");

    }
}
