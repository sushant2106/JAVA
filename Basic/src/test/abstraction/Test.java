package test.abstraction;

public class Test {
    public static  void main(String[] args){
         Car car=new Car();
         car.accelerate();
         car.show();
         car.setCarname("KIA Motors");
        System.out.println(Car.count);

        car.getCarname();




    }
}
