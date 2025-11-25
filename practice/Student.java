package practice;

public class Student {

    public static  int count;
    public  static  final  double PI;

    static {
        count=100;
        PI=3.14;
    }
    public Student(){
        count++;

    }
    public  static  void add(){
        System.out.println("I am add into static Method");
    }

}
