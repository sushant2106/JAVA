package multithreadingg.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CF {
    public static void main(String[] args) {
        CompletableFuture<String>completableFuture=CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(5000);
                System.out.println("Worker Thread");
            }
            catch (Exception e){

            }
       return "Okay";
        });
      //By default Its demon Thread
        String s=null;
        try {
            s=completableFuture.get();
           // s=completableFuture.getNow("nooo");

        }
        catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
        catch (ExecutionException e){
            throw  new RuntimeException(e);
        }
        System.out.println(s);
        System.out.println("Main ..");
    }
}
