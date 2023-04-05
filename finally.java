import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int c,j,k;

	     j=8;
	  try{
	      System.out.println("Enter the Number...");
	       c=sc.nextInt();
	     k=j/c ;
	  
 	  }
	  catch(Exception e)
	  {
	      System.out.println("UnknownError..");
	  }
	  finally{
	      System.out.println("Bye");
	  }
	  
	}
}
