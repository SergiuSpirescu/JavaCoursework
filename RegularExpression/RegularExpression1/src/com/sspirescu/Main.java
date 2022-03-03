package com.sspirescu;

import javafx.css.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        String thirdAlphanumericString = "delTabcDeeeF12GhhiiiabcDeeejhkl99z";
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{3}","YYY"));
        //{n} the number of occurences of the character preceding the brackets

        System.out.println(thirdAlphanumericString.replaceAll("^abcDe+", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe*", "YXYX"));

        System.out.println(thirdAlphanumericString.replaceAll("^acDe{2,5}", "YYY"));

        System.out.println(thirdAlphanumericString.replaceAll("h+i*j", "Y"));

        System.out.println("\n----------------------------\n");

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-Heading</h2>");
        htmlText.append("<p>Paragrah part 1</>");
        htmlText.append("<p>Paragrapgh part 2</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern = "<h2>";

        Pattern pattern = Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);

        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();

        int count = 0;

        while(matcher.find()) {
            count++;
            System.out.println("Occurence " + count +": " + matcher.start() + " to " + matcher.end());
        }

        String h2GroupPatter = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPatter);
        Matcher groupMatcher = groupPattern.matcher(htmlText);

        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while(groupMatcher.find()) {
            System.out.println("Occurence " + groupMatcher.group(1));
        }


        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMacher = h2TextPattern.matcher(htmlText);

        while(h2TextMacher.find()) {
            System.out.println("Occurence: " + h2TextMacher.group(2));
        }

        System.out.println("Harry is my friend".replaceAll("[H|h]arry", "Larry"));

        String tvTest = "tstvtkt";

//        String tNotVRegExp = "t[^v]";
        String tNotVRegExp = "t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count = 0;
        while (tNotVMatcher.find()) {
            count++;
            System.out.println("Occurence " + count + ": " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }

        //t(?=v) Positive look-ahead

        //number format matcher:  "^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"

        String phone1 = "1234567890"; //No match
        String phone2 = "(123) 456-7890"; //Match
        String phone3 = "123 456-7890"; //No match
        String phone4 = "(123)456-7890";

        System.out.println("phone1 = " + phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone2 = " + phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone3 = " + phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone4 = " + phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));


        //VISA card validation:  ^4[0-9]{12}([0-9]{3})?$


        String visa1 = "444444"; // no match
        String visa2 = "4444444444444";

        System.out.println("visa 1: " + visa1.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa 2: " + visa2.matches("^4[0-9]{12}([0-9]{3})?$"));


    }
}
