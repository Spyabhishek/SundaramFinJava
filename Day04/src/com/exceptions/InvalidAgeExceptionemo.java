package com.exceptions;

class CustomExceptionExample {
    static void checkAge(int age) {
        if (age < 18) {
            // Throwing the custom exception
            throw new InvalidAgeException("Sorry!! Invalid age");
        } else {
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(17); // This will trigger the exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

class InvalidAgeException extends RuntimeException {
    // Constructor for the custom exception
    InvalidAgeException(String message) {
        super(message); // Pass the message to the superclass constructor
    }
}
