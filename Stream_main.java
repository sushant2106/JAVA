import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Main
{
	public static void main(String[] args) {
	 List<Integer>li=Arrays.asList(11,20,5,15);
// 	li.stream().filter(n->n>10).forEach(System.out::println);
 List<Integer>lis1=li.stream().filter(n->n>10).collect(Collectors.toList());
   
  System.out.println(lis1);
   System.out.println("---------------------------------------------");
   //Adding 5 to each element 
      List<Integer>lis2=li.stream().map(n->n+=5).collect(Collectors.toList());
         System.out.println(lis2);
         
    //Terminal operation
    //toArray()
       System.out.println("---------------------------------------------");
       Stream<Integer>s=Stream.of(1,2,3,4,5);
       Object array[]=s.toArray();
       for(Object x:array){
           System.out.print(x+" ");
       }
     System.out.println("\n--------------------Count-------------------------");
   Stream<Integer>m=Stream.of(1,2,3,4,5);
     long siz=m.count();
     System.out.println("count:"+siz);
       
	
	 System.out.println("-------------------MIN && MAX--------------------------");
     Stream<Integer>s3=Stream.of(1,2,10,5,18);
     Optional<Integer>min=s3.min((o1,o2)->o1.compareTo(o2));
	 System.out.println("minimum:"+min.get());
	 
	  Stream<Integer>s4=Stream.of(1,2,10,5,18);
    Integer mini=s4.min(Comparator.comparing(Integer::valueOf)).get();
	 System.out.println("minimum:"+mini);
	 
    Stream<Integer>s5=Stream.of(1,2,10,5,18);
     Optional<Integer>max=s5.max((o1,o2)->o1.compareTo(o2));
	 System.out.println("maximum:"+max.get());
	 
	  System.out.println("\n-------------------Match--------------------------");
	  List<Integer>lis=Arrays.asList(22,33,44,55);
	  boolean flag=lis.stream().anyMatch(n->n==22);
	  System.out.println("anyMatch():"+flag);
	  
	  boolean flag1=lis.stream().allMatch(n->n>0);
	  System.out.println("allMatch():"+flag1);
	  
	  boolean flag2=lis.stream().noneMatch(n->n==11);
	  System.out.println("noneMatch():"+flag2);
	  
	  
	 	  System.out.println("\n-------------------findAny()--------------------------");
	  List<Integer>lis5=Arrays.asList(22,33,44,55);
	  Optional<Integer>val=lis5.stream().findAny();
	  System.out.println("findAny():"+val.get());
	 
	 
	 //findFirst()
	 
	 
}
}
