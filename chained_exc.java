import java.util.*;
import java.io.*;
public class Main
{  
    static void m1() throws Throwable{
        try{
            int a=10/0;
        }
        catch(Exception e){
           // e.printStackTrace();
           throw e.initCause(new IOException("we are able to handel"));
        }
    }
	public static void main(String[] args) {
	   try{
	        m1();
	   }
	   catch(Throwable e){
	       System.out.println(e.getCause());
	   }

	}
}
