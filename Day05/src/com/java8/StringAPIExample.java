package com.java8;
// JAVA 11
public class StringAPIExample {
    public static void main(String[] args) {
        String text = " hello world   ";

        System.out.println("isBlank: " + text.isBlank()); 
        System.out.println("strip: '" + text.strip() + "'"); 
        System.out.println("repeat: " + "sundaram".repeat(3)); 
        System.out.println("lines: " + "Line1\nLine2\nLine3".lines().count()); 
    }
}
