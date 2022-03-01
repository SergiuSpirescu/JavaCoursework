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
    }
}
