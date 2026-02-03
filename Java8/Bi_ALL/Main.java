package Bi_ALL;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.Supplier;


public class Main {
    public static void main(String[] args){

        Predicate<Integer>predicate=x -> x%2==0;

        System.out.println(predicate.test(10));

        BiPredicate<Integer,Integer>biPredicate=(x,y)-> x*2 ==0 && y%2 ==0;

        System.out.println(biPredicate.test(2,3));

        BiPredicate<String,Integer>biPredicate2=(str,x) -> str.length() ==x;

        System.out.println(biPredicate2.test("Vipul", 5));

        

        Function<String,Integer>function=str ->str.length();

        System.out.println(function.apply("Vipul"));

        BiFunction<String,String,Integer>biFucntion=(x,y) -> x.length() + y.length();

        System.out.println(biFucntion.apply("Hi","Hello"));
        
        
        Consumer<Integer>cosnumer=(x) -> {
            System.out.println(x);
        };
        cosnumer.accept(67);
        

        BiConsumer<Integer,Integer>biConsumer=(x,y) -> {
           System.out.println(x + y);
        };

        biConsumer.accept(1,2);

       //Supplier kya return karga Integer karega  _>Bi hota hi  nahi
        Supplier<Integer>supplier=()->1;

        System.out.println(supplier.get());





    }
}
