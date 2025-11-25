package practice;

public class Car extends Vehicle{

    public static  final int speedLimit=300;

    public int getSpeedLimit(){
        return speedLimit;
    }

    @Override
    public void accelerate(){
        System.out.println(" I am accelerate");
    }


    @Override
    public void decelerate(){
        System.out.println("Deacelrate is new thing");
    }

    public  static final void region(){
        System.out.println();

    }

}
