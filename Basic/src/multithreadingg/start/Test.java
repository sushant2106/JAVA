package multithreadingg.start;

public class Test {
    public static void main(String[] args) {
        //System.out.println(Thread.currentThread().getName());

        World world=new World();
        //Thread ka Object Create kiys hai know as
        //NEW State


        world.start();
        //Runnable and wait for running
        //waiting for CPU allocation


        for(int i=0;i<10000;i++){
            System.out.println(Thread.currentThread().getName());
        }


    }
}
