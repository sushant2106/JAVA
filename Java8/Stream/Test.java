package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        
       //Imperative Approach  
       int[] array={1,2,3,4,5};
       int sum=0;

       for(int i=0;i<array.length;i++){
          if(array[i]%2==0){
            sum+=array[i];
          }
       }
       System.out.println(sum);

       int[] array2={1,2,3,4,5};

       //stream 
       int sum2=Arrays.stream(array2).filter(n->n%2==0).sum();

       System.out.println(sum2);


       //How to Convert into Stream 

       List<String>list=Arrays.asList("apple","banana","Cherry");
      Stream<String>myStream=list.stream();  
      
       String[] array3={"apple","banana","cherry"};
       Stream<String>stream=Arrays.stream(array3);

       Stream<Integer>integerStream=Stream.of(1,2,3);

       Stream<Integer>limit=Stream.iterate(0,n ->n +1).limit(100);
      
       Stream<String>limit1=Stream.generate(() -> "hello").limit(5);

       







    }
    
}
