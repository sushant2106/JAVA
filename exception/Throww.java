package exception;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Throww {
    public  static  void method1() throws  FileNotFoundException{

        try{
            FileReader fileReader=new FileReader("a.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("File Not Found");
            throw new FileNotFoundException("oops we have one exception..");
        }
    }
    public  static  void method2() throws  FileNotFoundException{
        method1();
    }
    public static void main(String[] args) throws  FileNotFoundException{
      method2();

    }
}
