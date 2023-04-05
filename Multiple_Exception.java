import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int c,j,k;
	    c=0;
	     j=8;
	  int arr[]=new int[4];
	  try{
	    //  k=j/c ;
	       for(int i=0;i<=4;i++){
	           arr[i]=(i+1);
	       }
	  }
	  catch(ArithmeticException e){
	      System.out.println("can not divide by zero...");
	  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
	      System.out.println("Index out of boud...");
	  }
	  catch(Exception e){
	      System.out.println("UnknownError..");
	  }
	}
}
