import java.util.*;
class apna_Exception extends Exception{
    public apna_Exception(String msg){
        super(msg);
    }
}
public class Main
{
	public static void main(String[] args){
	    //throws Exception
		int i=20;
		int j=0;
		try{
		    j=18/i ;
		    if(j==0){
		       // throw new ArithmeticException();
		      // throw new Exception();
		      throw new apna_Exception("apna_Exception");
		    }
		}
		catch(apna_Exception e){
		    j=18/1;
		    System.out.println("default value is j="+j);
		    e.printStackTrace();
		    
		}
	}
}
