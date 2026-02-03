package staticmethod;

interface A{
    static void SayHello(){
        System.out.print("Hello !");
    }
    default void  sayBye(){
        System.out.println("Bye !");
    }
}

public class Myclass implements A{
    static void sayHello(){
         System.out.println("I am mYclass fucntion");
    
        }
    public static void main(String[] args){

        Myclass obj=new Myclass();

        //NOT allowed obj.sayHello(),Myclass.sayHello();

        System.out.println("How to call static Method Inside interface...");
        
       A.SayHello();

       obj.sayBye();

       //implemtents class ko interface class ka static ka access hi nahi rhta 
       //toh hum isee override nahi bolenge 

       
    }
}
