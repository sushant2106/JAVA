package multithreadingg.CompletableFuture;

import multithreadingg.threadpool.executorFrameWork.Executor;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CF2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> f1=CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(5000);
                System.out.println("Worker Thread");
            }
            catch (Exception e){

            }
            return "Okay";
        });
        CompletableFuture<String> f2=CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(5000);
                System.out.println("Worker Thread");
            }
            catch (Exception e){

            }
            return "Okay";
        });

        CompletableFuture<Void>f=CompletableFuture.allOf(f1,f2);
        f.join();
        //f.get()
        System.out.println("Main..");

        CompletableFuture<String> f3=CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(5000);
                System.out.println("Worker Thread");
            }
            catch (Exception e){

            }
            return "Okay";
        }).thenApply(x->x+x);
        System.out.println(f3.get());

        CompletableFuture<String> f4=CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(5000);
                System.out.println("Worker Thread");
            }
            catch (Exception e){

            }
            return "Okay";
        }).orTimeout(1, TimeUnit.SECONDS).exceptionally(s->"Timeout Occured");


//        Executor executor= Executors.newFixedThreadPool(1);
//        CompletableFuture<String> f5=CompletableFuture.supplyAsync(()->{
//            try {
//                Thread.sleep(5000);
//                System.out.println("Worker Thread");
//            }
//            catch (Exception e){
//
//            }
//            return "Okay";
//        },executor).orTimeout(1, TimeUnit.SECONDS).exceptionally(


    }
}
