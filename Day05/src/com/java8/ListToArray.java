package com.java8;

import java.util.*;
public class ListToArray{
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Cherry");

        String[] array = list.toArray(String[]::new);
        for (String fruit : array) {
            System.out.println(fruit);
        }
    }
}