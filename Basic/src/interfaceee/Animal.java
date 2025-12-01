package interfaceee;

public interface Animal {

    public abstract  void eat();

    void sleep();//by default even we are not using public abstract
    //its already present as public abstract


    public static final int MAX_AGE=150;
    int MIN_VALUE=1;


    public static  void info(){
        System.out.println("Java Interface can Have Static Method");
    }

    public default void run(){
        this.eat();
        System.out.println("Default Method is running");
        //System.out.println("Its Concrete Method");

    }





}
