package com.sspirescu;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println("Printing from the Lambda");
            System.out.println("This is line 2");
            System.out.format("This is line %d\n", 3);
        }).start();


        Employee john = new Employee("Rohan Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 41);
        Employee snow = new Employee("Jon Snow", 17);
        Employee jack = new Employee("Jack Reacher", 34);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(snow);
        employees.add(jack);

      AnotherClass anotherClass = new AnotherClass();
      String s = anotherClass.doSomething();

        System.out.println(s);

    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1,s2);
    }

}

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
//        {
//            UpperConcat uc = new UpperConcat() {
//                @Override
//                public String upperAndConcat(String s1, String s2) {
//                    System.out.println("i within anon class = " + i);
//                    return s1.toUpperCase() + s2.toUpperCase();
//                }
//            };

            System.out.println("The AnotherClass class name is: " + getClass().getSimpleName());
//            i++;
            System.out.println("i = " + i);

            return Main.doStringStuff(uc, "String 1", "String 2");
    }
}
//    public String doSomething() {
//        System.out.println("The anotherClass classes name is: " + getClass().getSimpleName());
//        return Main.doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                System.out.println("The anon class name is: " + getClass().getSimpleName());
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, "String 1", "String 2");
//    };
