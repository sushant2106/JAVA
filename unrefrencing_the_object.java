import java.util.*;
class Demo{
    Demo(){
        System.out.println("Object is created..");
    }
    protected void finalize(){
        System.out.println("Object is destroyed..");
    }
}
public class Main
{
	public static void main(String[] args) {
		Demo c=new Demo();
		c=null;//By assigning null to c so c is unrefrenced now 
		//so it go for garbage collection
		
	   Demo c1=new Demo();
	   Demo c2=new Demo();
	   c1=c2;//2.By assigning refrence to other jo new demo hai wo garbage mai
		
		new Demo();//by anonymous object
		
	// to force the jvm for garbage collection
	
	System.gc();
	}
}
