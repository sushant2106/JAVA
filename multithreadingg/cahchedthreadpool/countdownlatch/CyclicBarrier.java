package multithreadingg.cahchedthreadpool.countdownlatch;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrier {

    public CyclicBarrier(int numberOfService, Runnable runnable) {
    }

    public static void main(String[] args) throws InterruptedException {
        int numberOfService=3;

        ExecutorService executorService= Executors.newFixedThreadPool(numberOfService);
        CyclicBarrier barrier=new CyclicBarrier(numberOfService, new Runnable() {
            @Override
            public void run() {
                System.out.println("All subsystems are up and running. System startup complete.");
            }
        });
        executorService.submit(new DependentService(barrier));
        executorService.submit(new DependentService(barrier));
        executorService.submit(new DependentService(barrier));


        System.out.println("Main");

        executorService.shutdown();

    }

    static class DependentService implements Callable<String> {
        private final CyclicBarrier barrier;

        public  DependentService(CyclicBarrier barrier){
            this.barrier=barrier;
        }


        @Override
        public String call() throws Exception{
            System.out.println(Thread.currentThread().getName() +"service started.");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " is waiting at the barrier..");

            barrier.await();
            return  "Okay";
        }
    }

    void await() {
    }

}
