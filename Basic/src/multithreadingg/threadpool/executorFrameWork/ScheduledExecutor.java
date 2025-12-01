package multithreadingg.threadpool.executorFrameWork;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutor {
    public static void main(String[] args) {

        ScheduledExecutorService scheduler= Executors.newScheduledThreadPool(1);
         scheduler.schedule(()-> System.out.println("Task Executed after 5 second delay !"),
                 5, TimeUnit.SECONDS);

        scheduler.scheduleAtFixedRate(()-> System.out.println("Task Executed after every 5 second delay !"),
                5,
                5,TimeUnit.SECONDS);




         scheduler.shutdown();

    }
}
