package multithreadingg.cahchedthreadpool.countdownlatch;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static class DependentService implements Callable<String>{
        private final CountDownLatch latch;

        public  DependentService(CountDownLatch latch){
            this.latch=latch;
        }


        @Override
        public String call() throws Exception{
            try{
                System.out.println(Thread.currentThread().getName() +"service started.");
                Thread.sleep(2000);
            }
            finally {
                latch.countDown();
            }
            return  "Okay";
        }
    }
    public static void main(String[] args) throws InterruptedException {
        int numberOfService=3;

        ExecutorService executorService=Executors.newFixedThreadPool(numberOfService);
        CountDownLatch latch=new CountDownLatch(numberOfService);
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        latch.await();
        System.out.println("Main");
        executorService.shutdown();

        //if you want to make it shutdown Immeditaely
        //executorService.shutdownNow();

        //Count Down Latch is not re usable




    }

}
