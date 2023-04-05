import java.util.*;

public class Main
{
	public static void main(String[] args) {
		try{
		    method();
		    Thread.sleep(2000);
		  System.out.println("hum...");
		}
		catch(InterruptedException e)
		{
		    e.printStackTrace();
		}
	}
	static void method() throws InterruptedException{
	    System.out.println("hii..");
	    Thread.sleep(2000);
	}
}
