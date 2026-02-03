package DateTimeAPI.ZonedDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        
      ZonedDateTime now=ZonedDateTime.now();
      
      System.out.println(now);

      Set<String>availableZoneIds=ZoneId.getAvailableZoneIds();

      availableZoneIds.forEach(System.out::println);

      //To Make Custome 

    //   ZonedDateTime US_Pacific=ZonedDateTime.of(2000,12,1,14,30,30,30,ZoneId.of("US/Pacific"));
      
    //   System.out.println(US_Pacific);

    ZonedDateTime indiaTime=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
    System.out.println("Current time in India: " + indiaTime);
    ZonedDateTime newYorkTime=ZonedDateTime.now(ZoneId.of("America/New_York"));
    System.out.println("Cuurent time in New York: " + newYorkTime);


    ZonedDateTime indiaDateTime2=ZonedDateTime.now();
    System.out.println(indiaDateTime2.getZone());




    




    }
}
