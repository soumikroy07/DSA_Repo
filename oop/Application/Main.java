package com.soumik.oop.Application;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee arr[] = new Employee[2];
        for (int i=0; i<2; i++){
            String name = sc.next();
            String department = sc.next();
            int age = sc.nextInt();
            int YOE = sc.nextInt();
            arr[i] = new Employee(name, department, age, YOE);
        }


//        return those employees who have more than 10 years of experience

        List<Employee> employeesHavingMoreThan10 =  Arrays.stream(arr).filter(employee -> employee.getYOE() > 10).
                sorted((a, b) -> a.getAge() - b.getAge()).collect(Collectors.toList());
        for (Employee employee : employeesHavingMoreThan10){
            System.out.print(employee.getName()+ " " + employee.getYOE() + " ");
        }


        System.out.println();


        // who are in IT department
        List<Employee> employeesInIT = Arrays.stream(arr).
                filter(employee -> employee.getDepartment().equalsIgnoreCase("IT")).
                collect(Collectors.toList());
        for (Employee employee : employeesInIT){
            System.out.print(employee.getName()+ " " + employee.getYOE() + " ");
        }


        List<Employee> adminEmployees = Arrays.stream(arr).filter(employee -> employee.getDepartment().equalsIgnoreCase("Admin")).
                collect(Collectors.toList());
        for (Employee employee : adminEmployees){
            System.out.println(employee.getName());
        }



        // Get employee who having max YOE
        Employee maxYOE = Arrays.stream(arr).max((a, b) -> a.getYOE() - b.getYOE()).get();
        System.out.println(maxYOE.getName() + " " + maxYOE.getDepartment());



        // change the departments from IT to Information technology then collect

        List<Employee> ITEmployees = Arrays.stream(arr).map(employee -> {
            if(employee.getDepartment().equalsIgnoreCase("IT")){
                employee.setDepartment("InformationTechnology");
            }
            return employee;
        }).filter(employee -> employee.getDepartment().equalsIgnoreCase("InformationTechnology")).
                collect(Collectors.toList());

        for (Employee IT : ITEmployees){
            System.out.println(IT.getName() + " " + IT.getDepartment());
        }



        // get Max age person
        Employee employeeHavingMaxAge = Arrays.stream(arr).max((a, b) -> a.getAge() - b.getAge()).get();
        System.out.println(employeeHavingMaxAge);
    }
}
