package com.sspirescu;


import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities util;

    @org.junit.Before
    public void setUp() throws Exception {
       util = new Utilities() ;
    }

//    @org.junit.After
//    public void tearDown() throws Exception {
//        fail("No test implemented");
//    }



    @Test
    public void removePairs_test1() throws Exception {
//        Utilities utilities = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        System.out.println("Test PASSED");
        assertNull("Did not get null returned when argument passed was null", util.removePairs(null));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));
    }

    @org.junit.Test
    public void removePairs_test2() throws Exception {
//        Utilities utilities = new Utilities();
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        System.out.println("Test PASSED");
    }

    @org.junit.Test
    public void everyNthChar_test1() throws Exception {
//        Utilities util = new Utilities();
        char[] output = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'},2);
        assertArrayEquals(new char[] {'e','l'}, output);
    }

    @org.junit.Test
    public void everyNthChar_test2() throws Exception {
//        Utilities util = new Utilities();
        char[] output = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'},8);
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, output);
    }

    @org.junit.Test
    public void nullIfOddLength_test1() throws  Exception{
        Utilities util = new Utilities();
        assertNull(util.nullOddLength("odd"));
        assertNotNull(util.nullOddLength("even"));
    }

    @org.junit.Test
    public void converter_test() throws Exception{
        Utilities util = new Utilities();
        assertEquals(300, util.converter(10, 5));
//        assertEquals(0, util.converter(10, 0));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_testException() throws Exception{
        Utilities util = new Utilities();
//        assertEquals(30, util.converter(10, 4));
        assertEquals(0, util.converter(10, 0));
    }



}