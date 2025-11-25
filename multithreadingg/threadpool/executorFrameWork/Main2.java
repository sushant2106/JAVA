package multithreadingg.threadpool.executorFrameWork;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Future<?>future=executorService.submit(()-> System.out.println("Hello"));
//        try {
//            future.get();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        executorService.shutdown();
        //Future<String>submit=executorService.submit(()-> System.out.println("Hello"),"successs");

        ExecutorService executorService2= Executors.newFixedThreadPool(2);

      Future<Integer>submit=executorService2.submit(()->1+2);
      Integer i=submit.get();
      System.out.println("sum is "+i);
      executorService2.shutdown();
      System.out.println(executorService2.isShutdown());
      Thread.sleep(1);
      System.out.println(executorService2.isTerminated());


    }
}
