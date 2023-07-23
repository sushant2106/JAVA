import java.util.*;

public class Main
{
	public static void main(String[] args) {
	   int a=0;
	   int b=10;
	   try{
	       
	       if(a==0){
	           throw new ArithmeticException("a is zero here..");
	       }
	       b=b/a;
	   }
	   catch(ArithmeticException e){
	       System.out.println(e);
	   }
	}
}
