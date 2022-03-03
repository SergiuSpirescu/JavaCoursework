package com.sspirescu;

import javafx.css.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String challenge1 = "I want a bike.";
        String challenge2 = "I want a ball.";

        System.out.println(challenge1.matches("I want a (bike|ball)."));
        System.out.println(challenge2.matches("I want a (bike|ball)."));

        System.out.println(challenge2.matches("I want a \\w+."));

        String regExp3 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp3);
        Matcher matcher = pattern.matcher(challenge1);

        System.out.println(matcher.matches());

        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());


        String challenge4 = "Replace all blanks with an underscore.";

        System.out.println(challenge4.replaceAll("([ ])", "_"));
        System.out.println(challenge4.replaceAll("\\s", "_"));

        String challenge5 = "aaabcccccccdddefffg";

//        String regExp5 = "^[a]{3}b{1}c{7}d{3}[e]{1}[f]{3}[g]{1}";
        String regExp5 = "^a{3}bc{7}d{3}ef{3}g$";


        Pattern pattern2 = Pattern.compile(regExp5);
        Matcher matcher2 = pattern2.matcher(challenge5);
        System.out.println(matcher2.matches());

        System.out.println(challenge5.replaceAll(regExp5, "REPLACED"));

        String challenge7 = "abcd.135";

//        String regExp7 = "^([a-z]){4}(\\.){1}([0-9]){3}$";
        String regExp7 = "^[A-Z][a-z]+\\.\\d+$";

        Pattern pattern3 = Pattern.compile(regExp7);
        Matcher matcher3 = pattern3.matcher(challenge7);

        System.out.println(matcher3.matches());


    }
}
