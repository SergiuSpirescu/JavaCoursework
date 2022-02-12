package com.sspirescu;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println("Printing from the Lambda");
            System.out.println("This is line 2");
            System.out.format("This is line %d\n", 3);
        }).start();


        Employee john = new Employee("Johan Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 41);
        Employee snow = new Employee("Jon Snow", 17);
        Employee jack = new Employee("Jack Reacher", 34);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(snow);
        employees.add(jack);

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getName().compareTo(employee2.getName());
            }
        });

        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }

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