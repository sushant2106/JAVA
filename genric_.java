import java.util.*;

class Mygen<T>{
    T obj;
    void add(T obj){
        this.obj=obj;
    }
    T get(){
        return obj;
    }
}
public class Main
{
	public static void main(String[] args) {
	   Mygen<Integer>m=new Mygen<>();
	   m.add(2);
	   System.out.println(m.get());
	}
}
