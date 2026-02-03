package Stream.streamoperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        

        List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,4322,9,0,5,44,23,433,0,1,2);

        List<Integer>filteredList=list.stream().filter(x -> x%2==0).collect(Collectors.toList());
        
                System.out.println(filteredList);
        
                List<Integer>mappedList=filteredList.stream().map(x ->x/2).collect(Collectors.toList());
        
                System.out.println(mappedList);
        
                //Another way to do 
        
                List<Integer>filteredList2=list.stream().filter(x -> x%2==0).map(x ->x/2).collect(Collectors.toList());
                
                System.out.println(filteredList2);
        
                //we want only unique 
        
                List<Integer>filteredList3=list.stream().filter(x -> x%2==0).map(x ->x/2).distinct().collect(Collectors.toList());
                 
                System.out.println(filteredList3);
        
        
                //we can sort and customize 
                //its  in decending 
                List<Integer>filteredList4=list.stream().filter(x -> x%2 == 0).map(x ->x/2).distinct().sorted((a,b)->(b-a)).collect(Collectors.toList());
                 
                System.out.println(filteredList4);
        
                //we want to limit the elememt 
        
                List<Integer>filteredList5=list.stream().filter(x -> x%2==0).map(x ->x/2).distinct().sorted().limit(2).collect(Collectors.toList());
        
                System.out.println(filteredList5);
        
             
        
                //limit starting se kitne element chaiye 
                //skip starting se kitne element skip krna chate hai 
        
        
                List<Integer>filteredList6=list.stream().filter(x ->x %2==0).map(x ->x/2).
                distinct().sorted().limit(4).skip(1).collect(Collectors.toList());
        
                System.out.println(filteredList6);
        
        
                List<Integer>collect1=Stream.iterate(0,x->x+1)
                .limit(101).skip(1).filter(x -> x%2 ==0).map(x ->x/10).
                distinct().sorted().collect(Collectors.toList());
        
                System.out.println(collect1);
        
                
                List<Integer>collect2=Stream.iterate(0,x->x+1)
                .limit(101).skip(1).filter(x -> x%2 ==0).map(x ->x/10).
                distinct().sorted().peek(x -> System.out.println(x)).collect(Collectors.toList());
        
                System.out.println(collect2);
        
                Integer integer=Stream.iterate(0,x -> x+1).
                limit(101).map(x ->x/20).
                distinct().peek(System.out::println).max((a,b) -> b-a).get();

        System.out.println(integer);

        //distinct.count() 












    }
}
