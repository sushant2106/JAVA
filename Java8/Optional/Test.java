package Optional;

// import java.util.NoSuchElementException;
import java.util.Optional;

public class Test {

    private static Optional<String> getName(int id){
        //get from db
        // return "Ram";
        
        String name="Ram";
        String name2=null;

       System.out.println(name + " " + Optional.ofNullable(name));
       System.out.println(name2 + Optional.ofNullable(name2));
        return Optional.ofNullable(name);
        //Optional.of("Shyam");

    }
     public static void main(String[] args) {
          
        Optional<String>name=getName(2);
        String nameTobeUsed=name.isPresent() ? name.get() : "NA";

        String nameTobeUsed2=name.orElse(nameTobeUsed);
        System.out.println(nameTobeUsed2);

        System.out.println(nameTobeUsed);

        System.out.println(name.isEmpty());

        if(name.isPresent()){
            System.out.println(name.get());
        }

        name.ifPresent(x -> System.out.println(x));
        //using method reference 
        name.ifPresent(System.out::println);

        //We can use lambda expression 

        // String nameTobeUsed3=name.orElseGet(() -> {

        // });

      //String nameTobeUsed=name.orElseThrow(() -> new NoSuchElementException());
      //We can also use as ConstructorRefernce Reference 
      //name.orElseThrow(NoSuchElementException::new);

    Optional<String>optional=getName(3);
    Optional<String>optional1=optional.map(x -> x.toUpperCase());
    optional1.ifPresent(System.out::println);
    









     }
}
