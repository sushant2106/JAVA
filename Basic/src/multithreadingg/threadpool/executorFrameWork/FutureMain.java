package multithreadingg.threadpool.executorFrameWork;

import java.util.concurrent.*;

public class FutureMain {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Future<Integer>future=executorService.submit(()->{
            try{
                Thread.sleep(2000);

            }
            catch(InterruptedException e){
                System.out.println("Exception Occured: "+e);
            }
            System.out.println("HELLO");
            return 42;

        });
//        Integer i=null;
//        try{
//            i=future.get(1, TimeUnit.SECONDS);
//            System.out.println(future.isDone());
//            System.out.println(i);
//        }
//        catch (InterruptedException | ExecutionException e){
//            System.out.println("Exception Ocuured: "+e);
//        } catch (TimeoutException e) {
//            throw new RuntimeException(e);
//        }
        //false means agar task chal rha hai toh interrupt nhai kro
        //but future cancel kr dega
        future.cancel(true);
        System.out.println(future.isCancelled());
        System.out.println(future.isDone());
        executorService.shutdown();
    }
}
