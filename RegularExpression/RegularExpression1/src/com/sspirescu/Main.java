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
    }
}
