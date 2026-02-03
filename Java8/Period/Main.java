package Period;

import java.time.LocalDate;
// import java.time.Duration;
// import java.time.Instant;
// import java.time.LocalDate;
// import java.time.LocalDateTime;
import java.time.Period;

public class Main {

    public static void main(String[] args) throws InterruptedException{
   
    // Instant start=Instant.now();
    // Instant end=Instant.now();
    // Duration duration=Duration.between(start, end);
    
    // System.out.println(duration);

    // LocalDateTime a=LocalDateTime.now();
    // Thread.sleep(2000);
    // LocalDateTime b=LocalDateTime.now();

    // Duration duration2=Duration.between(a,b);
    // System.out.println(duration2);

    LocalDate now=LocalDate.now();
    LocalDate then=LocalDate.of(1990,2,2);

    Period period=Period.between(now, then);

    System.out.println(period);

    



    
    }
    
}
