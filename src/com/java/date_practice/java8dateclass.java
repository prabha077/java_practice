package com.java.date_practice;

//https://www.baeldung.com/java-8-date-time-intro

import java.time.*;
import java.time.temporal.ChronoUnit;

public class java8dateclass {
    public static void main(String args[])
    {
        LocalDate ld = LocalDate.now().minus(4, ChronoUnit.MONTHS);
        LocalDate ld1 = LocalDate.of(2020, Month.valueOf("FEBRUARY"),3);
        LocalDate ld2 = LocalDate.parse("2020-02-20");

        LocalTime ltt =LocalTime.now();
        LocalTime lt = LocalTime.ofSecondOfDay(3700);


        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt1 = LocalDateTime.now().minusHours(2);

        ZoneId zi = ZoneId.of("Europe/Paris");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(ldt, zi);

        ZoneOffset offset = ZoneOffset.of("+02:00");

        OffsetDateTime offSetByTwo = OffsetDateTime
                .of(ldt, offset);

        System.out.println(offSetByTwo);
    }
}
