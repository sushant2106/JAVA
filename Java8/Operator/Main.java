package Operator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args){
    


        //jab input ka type and output ka type same hota hai toh 
        //UnaryOperator use krte hai 
        //function ka special type hai 


        Function<Integer,Integer> function1=x -> x*x;
        Function<String,String> function2=str ->str.toLowerCase();

        UnaryOperator<Integer>unaryOperator=x ->x*x;
        System.out.println(unaryOperator.apply(5));


        UnaryOperator<String>unaryOperator2=str -> str.toLowerCase();


        BiFunction<String,String,String>biFunction=(str1,str2) -> str1 + str2;

        BinaryOperator<String>binaryOperator=(str1,str2)->str1+str2;

        System.out.println(binaryOperator.apply("Hello","World"));









    }
    
}
