import java.sql.SQLOutput;

public class data_type {

    public static void main(String[] args){
//        System.out.println("Hello");

        byte age1=20;
        short age3=20;
        int age=20;
        long age4=21455779877l;
        System.out.println("byte range"+ Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);


        float num=2.345f; //7 decimal tak precision hota hai
        double num2=2333.44444433; // up to 15 decimal tak precision
        System.out.println(num2);
        System.out.println(num);


        char mychar='a';
        //Memory mai har character ke crossponding ek
        //numerical value store hoti hai
        System.out.println((int)mychar);
        String name="Ram";

        System.out.println((int)Character.MIN_VALUE);
        System.out.println((int)Character.MAX_VALUE);
        System.out.println((char)10084);
        char hindichar=2309;
        System.out.println(hindichar);


        char heart='\u2764'; //unicode representation
        System.out.println(heart); //hexa decimal
        char hexa='\u27A4';
        System.out.println(hexa);


        //ASCII VALUE
        //0 to 127 ko ascii value

        System.out.println("ASCII Code");

        for(int i=0;i<=127;i++){
            System.out.println((char)i);
        }

        boolean x=true;
        boolean y=false;

        System.out.println(x);










    }
}
