package com.sspirescu;

public class Main {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Split this into an array";
                String[] parts = myString.split(" ");
                for (String part: parts) {
                    System.out.println(part + " ");
                }
            }
        };

        Runnable lambdaRunnable = () -> {
            String myString = "Split this into an array";
            String[] parts = myString.split(" ");
            for (String part: parts) {
                System.out.println(part + " ");
            }
        };

//        lambdaRunnable.run();
// Just to test it works
    }
}
