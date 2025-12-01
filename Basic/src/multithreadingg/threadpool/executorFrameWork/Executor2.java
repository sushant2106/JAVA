package multithreadingg.threadpool.executorFrameWork;


import java.util.concurrent.*;

public class Executor2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService =Executors.newSingleThreadExecutor();

      //kuch return krwana hai toh callabe
        //kuch return nahi krwana hai toh runnable
        Callable<String> callable=()->"Hello";
        //By deafult Submit mai callable hota hai
        //Future<?>future=executorService.submit(()->sout("HELLO");
        //ye  runnable hai

        Future<Integer>future=executorService.submit(()->42);
        System.out.println(future.isDone());
        System.out.println(future.get());
        executorService.shutdown();



    }

}
