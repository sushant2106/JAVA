package innnerclass.memberInnerClass;

public class Test {
    public static void main(String... args){
        System.out.println(
                "Member Inner Class"
        );
        Car car=new Car("Tata Safari..");
        Car.Engine engine=car.new Engine();

        engine.start();
        engine.stop();
    }
}
