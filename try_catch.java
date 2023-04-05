import java.util.*;


public class Main
{
	public static void main(String[] args) {
	   method1();
	   System.out.println("Main ended..");
	}
	private static void method1(){
	    method2();
	    System.out.println("method1 ended..");
	}
	private static void method2()
	{
	   try{
	        String str=null;
	    str.length();
	   }
	   catch (Exception e)
	   {
	    System.out.println("method2 ended..");
	    e.printStackTrace();
	   }
	   finally{
	       System.out.println("bye");
	   }
	}
}
