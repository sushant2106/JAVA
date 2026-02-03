package DateTimeFormatter;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args){
       
        LocalDateTime now=LocalDateTime.now();

        System.out.println(now);

        LocalDateTime parse=LocalDateTime.parse("2026-01-30T11:50:33.588642900");

        System.out.println(parse);


        LocalDate localDate=LocalDate.parse("2026-01-30");
        System.out.println(localDate);

        LocalDate now2=LocalDate.now();
        System.out.println(now2);




    }
    
}
