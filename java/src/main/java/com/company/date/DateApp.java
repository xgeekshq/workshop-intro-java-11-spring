package com.company.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.util.Arrays;

public class DateApp {

    public static void main(String[] args) {
        System.out.println("LocalDateTime: " + LocalDateTime.now());
        System.out.println("Localdate: " + LocalDate.now());
        System.out.println("LocalDateTime: " + LocalDateTime.now());
        System.out.println("YearMonth: " + YearMonth.now());
        System.out.println("Year: " + Year.now());
        System.out.println("Days of weeks: " + Arrays.toString(DayOfWeek.values()));
        System.out.println("Months: " + Arrays.toString(Month.values()));
    }
}

