import java.util.*;
import java.util.stream.Stream;
public class Main
{
	public static void main(String[] args) {
	  List<Integer>nums=Arrays.asList(10,13,8,9,49);
	   
     nums.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(n->System.out.println(n));
	   
     // str.forEach(n->System.out.println(n));
	   
	    
	    
	}
}
