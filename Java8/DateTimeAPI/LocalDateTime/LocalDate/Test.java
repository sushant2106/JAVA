package DateTimeAPI.LocalDateTime.LocalDate;

import java.time.LocalDate;
import java.time.Month;

public class Test {

    public static void main(String[] args){

    LocalDate now=LocalDate.now();
    System.out.println(now);

    //Now we want to custome date 

    LocalDate customeDate=LocalDate.of(1990,2,7);
    System.out.println(customeDate);

    int dayOfMonth=now.getDayOfMonth();
    Month month=now.getMonth();
    int month1=now.getMonthValue();
    int year=now.getYear();

    System.out.println(dayOfMonth);
    System.out.println(month);
    System.out.println(month1);
    System.out.println(year);



    LocalDate today=LocalDate.now();
    LocalDate yesterday=today.minusDays(1);
    LocalDate prevMonth=today.minusMonths(1);
    System.out.println("Previous day " + yesterday);
    System.out.println("PrevMonth :" + prevMonth);

    if(today.isAfter(yesterday)){
        System.out.println("Han Bhai");
    }



    

    }
    
}
