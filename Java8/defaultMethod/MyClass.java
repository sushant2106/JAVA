package defaultMethod;

interface Parent{
    default void sayHello(){
        System.out.println("Hello");
    }
}

class Child implements Parent{

}

class Child2 implements Parent{

    @Override
    public void sayHello(){
        System.out.println("Child says Hello..");
    }
}

public class MyClass {
  
    public static void main(String[] args){
        Child c=new Child();
        c.sayHello();

        Child2 c2=new Child2();

        c2.sayHello();


    }
    
}
