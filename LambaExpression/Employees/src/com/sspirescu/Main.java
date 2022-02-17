package com.sspirescu;

import java.util.ArrayList;
import java.util.List;

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

    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1,s2);
    }
}
