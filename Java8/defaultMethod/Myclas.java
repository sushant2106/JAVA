package defaultMethod;


interface A{
    default void sayHello(){
        System.out.println("A says Hello..");
    }
}

interface B{
    default void sayHello(){
        System.out.println("B says Hello..");
    }
}
public class Myclas implements A,B {
    
    @Override
    public void sayHello(){
        B.super.sayHello();
     //   System.out.println("My own Implemtation");
    }
    public static void main(String[] args){
        Myclas myclas=new Myclas();
        myclas.sayHello();

    }
    
}
