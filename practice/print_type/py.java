package print_type;

import java.util.Locale;
import java.util.Map;

public class py {
    public static void main(String[] args) {
//
//        Map<String,String>getenv=System.getenv();
//        System.out.println("Hello");
//        System.out.printf("");
//
//        //out is static member of system class
//        //Console pe kuch bhi print krna ho toh out ka use

        int a = 1;
        int b = 2;
        String c = "Sum";
        System.out.println(a + b + c);
        System.out.println(c + a + b);
        System.out.printf("Sum of %d and %d",a,b);

        char d='d';
        float e=1.2f;

        System.out.printf("%c %.2f",d,e);
        System.out.printf("%e",e);

        double number=1234567.89;
        System.out.printf("\nDefault Local %.2f",number);
        System.out.printf("\nDefault Local %,.2f%n",number);
        System.out.printf(Locale.US,"US local: %,.2f%n",number);


    }
}
