package functionInterface;

@FunctionalInterface
public interface MyInterface{
  
    public void sayHello();//abstact method 

    default void sayBye(){

    };

    public static void sayok() {

    }


}