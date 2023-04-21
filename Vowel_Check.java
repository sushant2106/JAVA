import java.io.*;

public class Main
{
    static boolean check(char c){
        c=Character.toLowerCase(c);
        if(c=='a' || c=='e'|| c=='i'|| c=='o' || c=='u'){
            return true;
        }
        return false;
    }
    
	public static void main(String[] args) {
	char str[]=new char[100];
   try{
    	File myfile=new File("data.txt");
	myfile.createNewFile();
	
	FileWriter output=new FileWriter("data.txt");
	output.write("I am there");
	output.close();
	FileReader input=new FileReader("data.txt");
	input.read(str);
	input.close();
	int count=0;
	for(int i=0;i<str.length;i++){
	  
	    if(check(str[i])){
	        count++;
	    }
	     
	}
	  System.out.println(count);
    }
	 
	catch(Exception e){
	    System.out.println(e.getMessage());
	}  
	   
	   
	}
}
