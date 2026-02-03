package DateTimeAPI.LocalDateTime.LocalDate.LocalTime;


import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        
     LocalTime now=LocalTime.now();

     System.out.println(now);

     System.out.println(now.getHour());
     System.out.println(now.getMinute());

     LocalTime customeTime=LocalTime.of(14,30,30);
     System.out.println(customeTime);

     String timeInsString="15:30:45";
     LocalTime parsedTime=LocalTime.parse(timeInsString);
     System.out.println(parsedTime);

    LocalTime BeforeOneHour=now.minusHours(1);
    System.out.println(BeforeOneHour);

    if(now.isAfter(BeforeOneHour)){
        System.out.println("Han Bhai");
    }





    }
}
