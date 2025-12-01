package oops.polymorphism.complie;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        MethodOverloading calculator=new MethodOverloading();
        System.out.println(calculator.add(5,10));
        System.out.println(calculator.add(5,10,15));
        System.out.println(calculator.add(5.5,10.5));
    }
}
