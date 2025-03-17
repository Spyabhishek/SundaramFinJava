package com.tests;

import org.junit.jupiter.api.*;     

public class AppTest {

    @BeforeAll
    public static void meth() {
        System.out.println("hi");
    }

    @BeforeEach
    public void meth2() { 
        System.out.println("Before Each");
    }

    @AfterEach
    public void meth3() {
        System.out.println("After Each");
    }

    @Test
    public void meth1() {
        System.out.println("Test1");
    }

    @Test
    public void meth4() {
        System.out.println("Test2");
    }
    @Test
    public void meth5() {
    	System.out.println("Test3");
    }
}
