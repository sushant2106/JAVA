package DateTimeFormatter;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Test {

    public static void main(String[] args) {
        
        LocalDate localDate=LocalDate.now();
        DateTimeFormatter myFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String format=localDate.format(myFormatter);
        System.out.println(localDate);
        System.out.println(format);

        String date="25/04/1998";

        DateTimeFormatter dateTimeFormatter2=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parse=LocalDate.parse(date,dateTimeFormatter2);
        System.out.println(parse);

// y - year
// M - month of year
// d - day of month
// H - hour of day (0-23)
// h - hour of am/pm (1-12)
// m - minute of hour
// s - second of minute
// S - fraction of second
// a - am/pm marker
// E - day of week
// D - day of year
// F - day of week in month
// w - week of year
// W - week of month
// k - hour of day (1-24)
// K - hour of am/pm (0-11)
// z - time zone name
// Z - time zone offset

String dateTimeString7 = "2023-04-24 10:30:45+05:30";
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssXXX");
ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTimeString7, formatter);
System.out.println(zonedDateTime);

       






    }
    
}
