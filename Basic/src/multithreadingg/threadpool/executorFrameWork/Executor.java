package multithreadingg.threadpool.executorFrameWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Executor {
    public static long factorial(int n){
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
        long result=1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return  result;
    }
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        ExecutorService executor= Executors.newFixedThreadPool(3);
        //Executors.newSingleThreadExecutor()
        //Executor executor=Executors.newFixedThreadPool(9);
     /*   executor.execute(()->{
        long result=factorial(finalI);
        System.out.println(result);
         }); */
        //Thread[] threads=new Thread[9];
        for(int i=1;i<10;i++){
            int finalI=i;

            executor.submit( () ->{
                long result=factorial(finalI);
                System.out.println(result);
            });

        }
        executor.shutdown();
        try{
            executor.awaitTermination(100, TimeUnit.SECONDS);
            //For Unlimited Wait
//            while(!executor.awaitTermination(1,TimeUnit.SECONDS)){
//                System.out.println("Waiting ...");
//            }
        }
        catch (InterruptedException e){
            throw  new RuntimeException(e);
        }

        System.out.println("Total time : "+(System.currentTimeMillis()-startTime));
    }
}
