package Function.chaning;

import java.util.function.Function;

public class Main {
    public static void main(String[] args){


        // Function<String,String>function1=s -> s.toUpperCase();
        // Function<String,String>function2=s ->s.substring(0,3);

        // Function<String,String>stringFunction=function1.andThen(function2);

        // System.out.println(stringFunction.apply("Vipul"));

        // System.out.println(function1.andThen(function2).apply("Vipul"));

        Function<Integer,Integer>function1=x -> 2*x;
        Function<Integer,Integer>function2= x -> x*x*x;

        System.out.println(function1.andThen(function2).apply(3));//216
        System.out.println(function2.andThen(function1).apply(3));//54

      
        //agar pehle function2 run krn hai then funciton we can use compose

        System.out.println(function1.compose(function2).apply(3));

       

        //Identity Function jo aap Input mai doge wahi putput mai ayega 

        Function<String,String>identityFunction=Function.identity();
        System.out.println(identityFunction.apply("Vipul"));



        
    }
}
