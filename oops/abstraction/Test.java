package oops.abstraction;

public class Test {
    public static void main(String[] args) {
//        Dog dog=new Dog();
//        dog.sayHello();
//
//        Animal dog2=new Dog();
//        dog2.sayHello();

        //Abstract class ka object nabi ban sakta hai
        //Aniaml animal=new Animal();not allowed

        Lamborgini lamborgini=new Lamborgini();
//        Lamborgini.ChangeGear();

        lamborgini.accelerate();
        lamborgini.ChangeGear();




    }
}
