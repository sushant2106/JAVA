package test.inheritance;

public class Dog extends  Animal{
    @Override  //annotation
    public void sayHello(){
        System.out.println("Woof");
    }

    public void sayBye(){
        System.out.println("Woof Woof");

    }
}
