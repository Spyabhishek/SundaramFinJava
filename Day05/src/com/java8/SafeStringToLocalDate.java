package com.java8;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class SafeStringToLocalDate {
	
	    public static void main(String[] args) {
	        String dateStr = "10-03-2025"; // Expected format: dd/MM/yyyy

	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	        try {
	            LocalDate localDate = LocalDate.parse(dateStr, formatter);
	            System.out.println("Converted LocalDate: " + localDate);
	        } catch (DateTimeParseException e) {
	            System.out.println("Invalid date format: " + e.getMessage());
	        }
	    }
}





