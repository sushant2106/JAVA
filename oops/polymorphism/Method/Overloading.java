package oops.polymorphism.Method;

public class Overloading {

    public static int sum(int ...a){
        //Treating as Array
        int sum1=0;
        for(int i:a){
            sum1+=i;
        }
        return sum1;
    }
    public static  int sum(int a,int b){
        return a+b;
    }
    public  static  int sum(int a){
        return a;
    }
    public  static  float sum(float a,float b){
        return a+b;
    }
    public static  void main(String[] args){
        System.out.println(sum(2,3));
        System.out.println(sum(3));
        System.out.println(sum(2.0f, 4.0f));
        //naam same hai parameter ki sakal alag hai

        System.out.println("I am array ...a"+sum(1,2,3,4,5));

    }
}
