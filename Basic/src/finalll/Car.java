package finalll;



public class Car extends  Vehicle{

//    private final int speedLimit=200;
    private final int speedLimit;
    public  Car(){
      speedLimit=300;
    }

    public int getSpeedLimit(){
        return speedLimit;
    }



    @Override
    public void accelerate(){
        System.out.println("I am accelerate..");
    }

    @Override
    public   void decelerate(){
        System.out.println("I am deaccelerate..");
    }

    public final void airBags(){
        System.out.println("4 Air Bags");
    }
}
