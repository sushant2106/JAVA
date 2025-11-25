package multithreadingg.threadpool.executorFrameWork;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService= Executors.newFixedThreadPool(2);

        Callable<Integer>callable1=() ->{
            System.out.println("Task 1");
            Thread.sleep(1000);
            return  1;
        };
        Callable<Integer>callable2=()->{
            System.out.println("Task 2");
            Thread.sleep(1000);
            return  2;
        };
        Callable<Integer>callable3=()->{
            System.out.println("Task 3");
            Thread.sleep(1000);
            return  3;
        };

        List<Callable<Integer>> list= Arrays.asList(callable1,callable2,callable3);
        //List<Future<Integer>>futures=executorService.invokeAll(list);
        //invoke all will block main thread
 List<Future<Integer>>futures=executorService.invokeAll(list,1,TimeUnit.SECONDS);
 //1 second mai sare task complete kre

        for(Future<Integer> f: futures){
            System.out.println(f.get());
        }
        executorService.shutdown();
        System.out.println("Hello World...");


        //Jo bhi pehle Complete hoga usee return kr dega

        Integer i=executorService.invokeAny(list);
        System.out.println(i);



    }
}
