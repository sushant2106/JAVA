package multithreadingg.start;

public class TestNew {
    public static void main(String[] args) {

        WorldImplement world=new WorldImplement();
       Thread t1=new Thread(world);
       t1.start();

//        for(int i=0;i<10000;i++){
//            System.out.println(Thread.currentThread().getName());
//        }



    }
}
