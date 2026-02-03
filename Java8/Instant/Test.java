package Instant;

import java.time.Instant;

public class Test {

    public static void main(String[] args){
      //it gives time in millisecond from 1st jan 1970 in utc
        long currentTimeMillis=System.currentTimeMillis();

        System.out.println(currentTimeMillis);

        Instant now=Instant.now();

        System.out.println("EPOC z is called  Time This instant gives in Nano:" + now);

        System.out.println(now.atZone(null));






    }
    
}
