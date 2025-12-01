package test.innerclass;

public class Testing {
    public static void main(String[] args) {
        Animal obj=new Animal(){

            @Override
            public void  sound(){
                System.out.println("lets say meow");
            }
        };
        obj.sound();


        Car car=new Car(){

            @Override
            public void caranme(){
                System.out.println("THis is my carname");
            }
        };
        Car.CarType();
        car.caranme();



    }
}
