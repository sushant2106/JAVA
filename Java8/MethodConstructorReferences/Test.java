package MethodConstructorReferences;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void print(String s){
        System.out.println(s);
    }

    public void print2(String s){
        System.out.println(s);
    }
    private static int hello(){
      return 1;
    }
    public static void main(String[] args){
        List<String>students=Arrays.asList("Alice","Bob","CharLie");

        //students.forEach(x-> System.out.println(x));

        students.forEach(Test::print);//:: Method Reference Operator 
        //yaha Method ka refrence de rhe hai 

        System.out.println(hello());//hello method invoke kr rhe hai 

        Test test=new Test();
        students.forEach(test::print2);





    }
}
