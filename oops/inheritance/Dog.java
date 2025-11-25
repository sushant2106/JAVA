package oops.inheritance;

public class Dog extends Animal {
    //Method Overriding

    @Override  //annotation
    public void sayHello(){
        System.out.println("Woof");
    }

    public void sayBye(){
        System.out.println("Woof Woof");

    }



}
