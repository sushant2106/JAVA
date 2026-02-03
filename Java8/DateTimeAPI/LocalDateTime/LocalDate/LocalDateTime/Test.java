package DateTimeAPI.LocalDateTime.LocalDate.LocalDateTime;

import java.time.LocalDateTime;

public class Test {
    public static void main(String[] args){

     LocalDateTime now=LocalDateTime.now();
     System.out.println(now);

     LocalDateTime myDate=LocalDateTime.parse("2023-01-111T13:48");
     System.out.println(myDate);
     

    }
}
