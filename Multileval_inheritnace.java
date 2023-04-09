import java.util.*;
class Animal{
    public void ear()
    {
        System.out.println("I have two ear");
    }
}
class Dog extends Animal{
    public void bark()
    {
        System.out.println("I do bark also");
    }
}
class small extends Dog{
    public void sm(){
        System.out.println("I am small");
        
        
    }
}
class Hello{
public static void main(String args[]){
    //   Dog v=new Dog();
    //   v.ear();
    //   v.bark();
      small v=new small();
       v.ear();
       v.bark();
       v.sm();
}
}
