package com.sspirescu;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        String myString = "aAbBc %CdD";

        System.out.println(everySecondChar(myString));

        Function<String, String> lambdaEverySecondChar = (String s) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(lambdaEverySecondChar.apply("1234567890"));

        String result = everySecondCharacter(lambdaEverySecondChar, "0987654321");
        System.out.println(result);


        Supplier<String> iLoveJava = () -> {
            return "I Love Java!";
        };
//        System.out.println(iLoveJava.get());

        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        List<String> firstUpperCaseList = new ArrayList<>();

//        topNames2015.forEach(name ->
//                firstUpperCaseList.add(name.substring(0,1).toUpperCase() + name.substring(1)));

//        firstUpperCaseList.sort((s1,s2) -> s1.compareTo(s2));
//        firstUpperCaseList.forEach(s ->
//                System.out.println(s));

//        firstUpperCaseList.sort(String::compareTo);
//        firstUpperCaseList.forEach(System.out::println);

//        firstUpperCaseList.stream().sorted(String::compareTo).forEach(System.out::println);

    long namesStartingWithA =  topNames2015
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .filter(name -> name.startsWith("A"))
                .count();

        System.out.println("Number of names beggining with A is: " + namesStartingWithA);

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

    public static  String everySecondCharacter(Function<String, String> func, String string) {

       return func.apply(string);
    }

}
