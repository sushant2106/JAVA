package multithreadingg.threadpool.executorFrameWork;

import java.util.Objects;
import java.util.concurrent.Callable;

public class CallableTask implements Callable {

    @Override
    public Object call() throws  Exception{
       Thread.sleep(1);
        return null;
    }
}
