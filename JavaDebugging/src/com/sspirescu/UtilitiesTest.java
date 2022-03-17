package com.sspirescu;


import java.util.Arrays;

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
        assertNull("Did not get null returned when argument passed was null", utilities.removePairs(null));
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("", utilities.removePairs(""));
    }

    @org.junit.Test
    public void removePairs_test2() throws Exception {
        Utilities utilities = new Utilities();
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
        System.out.println("Test PASSED");
    }

    @org.junit.Test
    public void everyNthChar_test1() throws Exception {
        Utilities util = new Utilities();
        char[] output = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'},2);
        assertArrayEquals(new char[] {'e','l'}, output);
    }

    @org.junit.Test
    public void everyNthChar_test2() throws Exception {
        Utilities util = new Utilities();
        char[] output = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'},8);
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, output);
    }

    @org.junit.Test
    public void nullIfOddLength_test1() throws  Exception{
        Utilities util = new Utilities();
        assertNull(util.nullOddLength("odd"));
        assertNotNull(util.nullOddLength("even"));
    }



}