package oops.inheritance;

public class Test {
    public  static void main(String[] args){
        Dog dog=new Dog();
        dog.setAge(2);
        dog.setName("Bob");
        dog.eat();
        dog.sayHello();

        Cat cat=new Cat();
        cat.sayHello();

        Animal myanimal=new Animal();
        myanimal.sayHello();

        System.out.println("\nRun time PolyMorphism..");

        Animal dog2=new Dog();
        //Referece Parent class and Object sub class ka kar rhe hai
        dog2.sayHello();
        //Jo Jo Animal Mai Method honge Usi ko call kr sakte hai



        Animal cat2=new Cat();//upcasting
        cat2.sayHello();

        //at run time we  jvm is deciding which method os call

        //compile time achive through -> MethodOverloading
        //Run time achive through ->MethodOverriding/DynamicMethodDispatch
        //upcating ->Lower Hierarchy ka Object UpperHiearchy wale reference mai
        //daal rhe hai

        double d=2.32223;
        int e=(int)d;
        System.out.println(e);

        Dog myDog=(Dog)dog2; //downcast













    }
}
