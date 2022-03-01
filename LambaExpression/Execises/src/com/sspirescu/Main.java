package com.sspirescu;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        String myString = "aAbBc %D";

        System.out.println(everySecondChar(myString));

        Function<String, String> lambdaEverySecondChar = (String s) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++ ) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        
    }

    public static  String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++ ) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

}
