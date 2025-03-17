package com.model;

class Final {
    public static void main(String[] args) {
        final int MAX_VALUE = 100; // final variable
        System.out.println("The maximum value is: " + MAX_VALUE);

        // Attempting to change the value of a final variable will result in a compile-time error
//         MAX_VALUE = 200; // This will give an error
    }
}

