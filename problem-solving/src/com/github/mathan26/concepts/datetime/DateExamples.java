package com.github.mathan26.concepts.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateExamples {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(LocalDate.of(2025, Month.OCTOBER, 30));

//       adding days
        System.out.println(LocalDate.now().plusDays(30));

//        formatting the data
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formatted = LocalDate.now().format(dateTimeFormatter);
        System.out.println(formatted);

//        Time Zone support
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(zdt);

        ZoneId londonZone = ZoneId.of("Europe/London");
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime london =  localDateTime.atZone(londonZone);
        System.out.println(london);

//        convert between timezones
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        ZonedDateTime newYorkTime = london.withZoneSameInstant(newYorkZone);
        System.out.println(newYorkTime);

    }
}
