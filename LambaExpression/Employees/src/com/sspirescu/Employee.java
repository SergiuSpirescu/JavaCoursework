package com.sspirescu;

import java.util.*;



class CodeToRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing from the Runnable");
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass {

    public String doSomething() {

        UpperConcat uc = (s1, s2) -> {
            System.out.println("The lambda expressions class is: " + getClass().getSimpleName());

            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };


        int i = 0;

        System.out.println("The AnotherClass class name is: " + getClass().getSimpleName());
//            i++;
        System.out.println("i = " + i);

        return Main.doStringStuff(uc, "String 1", "String 2");
    }

    public void printValue() {
        int number = 25;

        Runnable r = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value is " + number);
        };

        new Thread(r).start();
    }
}