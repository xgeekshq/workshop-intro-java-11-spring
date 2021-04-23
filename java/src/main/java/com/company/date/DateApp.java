package com.company.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.YearMonth;

public class DateApp {

    public static void main(String[] args) {
        System.out.println("LocalDateTime: " + LocalDateTime.now());
        System.out.println("Localdate: " + LocalDate.now());
        System.out.println("LocalDateTime: " + LocalDateTime.now());
        System.out.println("YearMonth: " + YearMonth.now());
        System.out.println("Year: " + Year.now());
        System.out.println("Days of weeks: " + DayOfWeek.values());
    }
}

