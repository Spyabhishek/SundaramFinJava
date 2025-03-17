package com.exceptions;
import java.util.Scanner;

//public class Questions {
//    
//    public static void Number(int num) throws IllegalArgumentException, ArithmeticException {
//        if (num < 0) {
//           
//            throw new IllegalArgumentException("Negative number not allowed!");
//        } else if (num == 0) {
//            
//            throw new ArithmeticException("Zero is not a valid input!");
//        } else {
//            
//            System.out.println("Valid number entered: " + num);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter an integer: ");
//        
//        try {
//            int number = scanner.nextInt();
//            Number(number);
//          
//        } catch (Exception e) {
//            System.out.println("Unexpected error: " + e);
//        }
//            scanner.close();
//    
//    }
//}


public class Questions {
    public static void validateInput(String input) throws IllegalArgumentException, RuntimeException {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be empty!");
        }
        if (input.length() < 5) {
            throw new RuntimeException("Input must be at least 5 characters long!");
        }
        System.out.println("Valid input: " + input);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        try {
            validateInput(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
        
        scanner.close();
    }
}