package test.threadBegin.threadmethod;

public class InterupMethod extends  Thread{
    @Override
    public void run() {
        try{
           Thread.sleep(3000);
        }
      catch (InterruptedException e) {
          System.out.println("GOT INTERRUPTED");
        }
    }


        public static void main(String[] args) throws InterruptedException {
        InterupMethod obj=new InterupMethod();
        obj.start();

        obj.interrupt();


    }
}
