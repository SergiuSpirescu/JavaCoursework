package com.sspirescu;


import static org.junit.Assert.*;

public class UtilitiesTest {

//    @org.junit.Before
//    public void setUp() throws Exception {
//        fail("No test implemented");
//    }

//    @org.junit.After
//    public void tearDown() throws Exception {
//        fail("No test implemented");
//    }

    @org.junit.Test
    public void everyNthChar() {
        fail("No test implemented");
    }

    @org.junit.Test
    public void removePairs() {
        fail("No test implemented");
    }

    @org.junit.Test
    public void converter() {
        fail("No test implemented");
    }

    @org.junit.Test
    public void nullOddLength() {
        fail("No test implemented");
    }

    @org.junit.Test
    public void removePairs_test1() throws Exception {
        Utilities utilities = new Utilities();
        assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"));
        System.out.println("Test PASSED");
    }

    @org.junit.Test
    public void removePairs_test2() throws Exception {
        Utilities utilities = new Utilities();
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
        System.out.println("Test PASSED");
    }
}