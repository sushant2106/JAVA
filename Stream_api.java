import java.util.*;
import java.util.stream.Stream;
public class Main
{
	public static void main(String[] args) {
	  List<Integer>nums=Arrays.asList(4,5,6,7,8,1);
	   List<Integer>nums2=Arrays.asList(4,5,6,7,8,1);
	 // long siz=nums.count();
	//  Stream<Integer>data=nums.stream().map(n ->n*2);
	 // Stream<Integer>arr=data.sorted();
	// Stream<Integer>mapdata=data.map(n -> n*2);
	  
	  //  data.forEach(n->System.out.println(n));
	    
	    nums.stream().filter(n->n%2==1).sorted().map(n->n*3).forEach(n->System.out.println(n));
	    
	    System.out.println("Addition using stream");
	    int sum= nums2.stream().filter(n->n%2==1).sorted().map(n->n*3).reduce(0,(c,e)->c+e);
	    System.out.println(sum);
	}
}
