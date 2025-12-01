package test.inheritance;

public class Test {
    public static void main(String[] args) {
//        Cat cat=new Cat();
//
//        cat.setName("Ram");
//        System.out.println(cat.getName());
//
//        Dog dog=new Dog();
//        dog.sayHello();


        System.out.println("myanimal is Type of Animal and reference is alos Animal");
        Animal myanimal=new Animal();

        myanimal.sayHello();


        System.out.println("Here Type is Animal but the Object is Dog() type");
        myanimal=new Dog();
        myanimal.sayHello();//assign new Object to Old Variable
        //myanimal.sayBye();











    }
}
