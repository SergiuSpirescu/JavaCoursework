package com.sspirescu;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Employee john = new Employee("Rohan Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 41);
        Employee snow = new Employee("Jon Snow", 17);
        Employee jack = new Employee("Jack Reacher", 34);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(snow);
        employees.add(jack);


        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });


//        for (Employee employee : employees) {
//            System.out.println(employee.getName());
//            System.out.println(employee.getAge());
//        }

//        Employee employee;   cannot define outside of scope
//        System.out.println("*************");
//        for (int i=0; i<employees.size(); i++) {
//            Employee employee = employees.get(i);
//            System.out.println(employee.getName());
//            new Thread(() -> System.out.println(employee.getAge())).start();
//        }
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
