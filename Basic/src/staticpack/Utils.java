package staticpack;

public class Utils {


    public static  final double PI;
    static {
        PI=3.14159;
    }
    public static  int add(int a,int b) {
        return a+b;
    }
    public  static String  trimAndUpperCase(String str){

        return str!=null ? str.trim().toUpperCase() : "";
    }

}
