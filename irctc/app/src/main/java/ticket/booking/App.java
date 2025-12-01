package ticket.booking;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {


    public static void main(String[] args) {

       List<Integer>l=Arrays.asList(1,2,3,4,5,6,7,8,9);
       List<Integer>l1=l.stream().filter(n->n%2==0).collect(Collectors.toList());

    }
}
