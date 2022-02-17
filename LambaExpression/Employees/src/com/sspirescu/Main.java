package com.sspirescu;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Employee john = new Employee("Rohan Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 41);
        Employee snow = new Employee("Jon Snow", 17);
        Employee jack = new Employee("Jack Reacher", 34);
        Employee red = new Employee("Red Riding Hood", 35);
        Employee charming = new Employee("Prince Charmning", 31);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(snow);
        employees.add(jack);
        employees.add(red);
        employees.add(charming);

        printEmployeesByAge(employees, "Employees over 30", employee -> (employee.getAge() > 30));

        System.out.println( " / / / / / / / / / / ");
        printEmployeesByAge(employees, "Employees 30 or less", employee -> employee.getAge() <= 30);

        System.out.println( " / / / / / / / / / / ");
        printEmployeesByAge(employees, "\nEmployees younger than 25", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge() < 25;
            }
        });

        System.out.println( " / / / / / / / / / / ");

        IntPredicate greaterThan15 = i -> i > 15;
        IntPredicate lessThan100 = i -> i < 100;
        System.out.println(greaterThan15.test(10));
        int a = 20;
        System.out.println(greaterThan15.test(a + 5));

        System.out.println(greaterThan15.or(lessThan100).test(10));
        System.out.println(greaterThan15.and(lessThan100).test(50));
    }

    private static void printEmployeesByAge(List<Employee> employees,
                                            String ageText,
                                            Predicate<Employee> ageCondition) {
        System.out.println(ageText);
        System.out.println("=============");
        for (Employee employee : employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
        }
    }
}
