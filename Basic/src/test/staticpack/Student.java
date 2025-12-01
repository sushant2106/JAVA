package test.staticpack;

public class Student {
    public static int count=0;

    static {
        count=10;
        System.out.println("Assign the value to count");
    }
    public  static  void getName(){
        System.out.println("This is static getName");
    }

    public void add(){
        System.out.println("I am concrete function add");
    }
}
