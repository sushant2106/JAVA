package datatypes;

import java.sql.SQLOutput;

public class TestString {
    public static void main(String[] args){
//      int[] arr=new int[5];
//      arr[0]=1;
//        System.out.println(arr[0]);
//        String address=new String("India");
        String name="address";
        String x="Ram"; //Stringpool
        String a=new String("Ram");//"Ram" purana wala hi use hoga
        String b=new String(x); //New location pe jake ram likha jayega
        String c="Ram";
        System.out.println(a==b);// We are checking refrence
        System.out.println(x==c);
        System.out.println(x==a);
        //heap mai a,b
        //x,c,d ->will point to the memory location
        //of ram stored in StringPool
        //a,b will point to moemory lccation of ram
        //stored in heap

        System.out.println(x.equals(a));








    }
}
