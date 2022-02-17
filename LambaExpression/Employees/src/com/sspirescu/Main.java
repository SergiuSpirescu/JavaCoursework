package com.sspirescu;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee john = new Employee("Rohan Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 41);
        Employee snow = new Employee("Jon Snow", 17);
        Employee jack = new Employee("Jack Reacher", 34);
        Employee red = new Employee("Red Riding Hood" , 35);
        Employee charming = new Employee("Prince Charmning" , 31);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(snow);
        employees.add(jack);
        employees.add(red);
        employees.add(charming);


        System.out.println("Employees over 30:");
        System.out.println("=============");

        employees.forEach(employee -> {
            if(employee.getAge()>30) {
                System.out.println(employee.getName());
            }
        });

        System.out.println("---------");
        
        employees.forEach(employee -> {
            if(employee.getAge() <= 30 ) {
                System.out.println(employee.getName());
            }
        });

//        for (Employee emp : employees) {
//            if (emp.getAge() > 30) {
//                System.out.println(emp.getName());
//            }
//        }

    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1,s2);
    }
}
