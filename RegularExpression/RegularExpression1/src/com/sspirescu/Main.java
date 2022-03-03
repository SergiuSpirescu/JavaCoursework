package com.sspirescu;

public class Main {

    public static void main(String[] args) {

        String string = "I am a string. Yes I am!";

        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiijhkl99z";
        System.out.println(alphanumeric.replaceAll(".","Y"));

        System.out.println(alphanumeric.replaceAll("^abcDeee","YYY"));

        String secondString = "delTabcDeeeF12GhhiiiabcDeeejhkl99z";
        System.out.println(secondString.replaceAll("^abcDeee","YYY"));
        //the string MUST start with abcDeee


        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("^abcDeeeF12Ghhiiijhkl99z"));

        System.out.println(alphanumeric.replaceAll("99z$","THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]","X"));
//        System.out.println(alphanumeric.replaceAll("[aei]","Replaced Here"));

        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        System.out.println(alphanumeric.replaceAll("[^ej]", "X"));

        System.out.println(alphanumeric.replaceAll("[abcdef345678]", "X"));

        System.out.println(alphanumeric.replaceAll("[a-f3-8]", "X"));

        System.out.println(alphanumeric.replaceAll("(?i)[a-f3-8]", "X"));

        System.out.println(alphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(alphanumeric.replaceAll("\\d", "X"));
        System.out.println(alphanumeric.replaceAll("\\D", "X"));

        String hasWhitespace = "I have blanks and\ta tab, also a newline \n";
        System.out.println(hasWhitespace);

        System.out.println(hasWhitespace.replaceAll("\\s", ""));
        System.out.println(hasWhitespace.replaceAll("\t", "X"));
        System.out.println(hasWhitespace.replaceAll("\\S", ""));

        System.out.println(alphanumeric.replaceAll("\\w", "X"));


        System.out.println(hasWhitespace.replaceAll("\\w", "X"));
        System.out.println(hasWhitespace.replaceAll("\\W", "X"));


        System.out.println(hasWhitespace.replaceAll("\\b", "X"));



    }
}
