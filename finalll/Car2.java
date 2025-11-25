package finalll;


//If class its self is final then We Can't
//Inherit that class
public final class Car2 {
    private final int speedLimit;
    public  Car2(){
        speedLimit=300;
    }

    public int getSpeedLimit(){
        return speedLimit;
    }



}
