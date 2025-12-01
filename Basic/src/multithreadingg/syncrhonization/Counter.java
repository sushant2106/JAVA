package multithreadingg.syncrhonization;

public class Counter {
    private int count=0;

    //Shared Resources ko critical section bolte hai
    //locking on resources
    public synchronized void increment(){
        count++;
    }

    //How to make only block of Code to Syncronized
//    public void increment(){
//        synchronized(this){
//            count++;
//        }
//    }
    public int getCount(){
        return count;
    }


}
