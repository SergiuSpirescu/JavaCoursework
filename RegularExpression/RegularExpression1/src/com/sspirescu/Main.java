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

    }
}
