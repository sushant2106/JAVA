package MATH;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        int a=10;
        int b=11;
        int k=-1;

        int max=Math.max(a,b);
        int min=Math.min(a,b);
        int c=Math.abs(k);
        double d=1.52;
        System.out.println("Smallest Integer Greater than d:"+Math.ceil(d));
        System.out.println("CLOSEST Integer "+Math.floor(d));
        System.out.println(Math.round(d));

        int e=4;

        System.out.println(Math.sqrt(e));
        System.out.println(Math.pow(12,2));
        System.out.println(Math.log(10));
        System.out.println(Math.log10(10));
        System.out.println(Math.PI);
        System.out.println((int)(Math.random()));

        System.out.println(Math.nextAfter(1,2));










    }
}
