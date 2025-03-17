package com.java8;

import java.time.LocalDate;

public class DateDemo {
    public static void main(String[] args) {
        // Get the current date
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

       // Create a specific date
        LocalDate specificDate = LocalDate.of(2023, 10, 15);
        System.out.println("Specific Date: " + specificDate);

        // Add days, months, years
        LocalDate futureDate = today.plusDays(10);
        System.out.println("Future Date (10 days later): " + futureDate);

        // Subtract days
        LocalDate pastDate = today.minusWeeks(2);
        System.out.println("Past Date (2 weeks ago): " + pastDate);
/*
        // Get day of the week and day of the year
        System.out.println("Day of the week: " + today.getDayOfWeek());
        System.out.println("Day of the year: " + today.getDayOfYear());

        // Check if a year is a leap year
        System.out.println("Is this a leap year? " + today.isLeapYear());
  */
    }
}


