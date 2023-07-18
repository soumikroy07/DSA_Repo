package com.soumik.oop.Application;

public class Employee {
    private String name;
    private String department;
    private int age;
    private int YOE;

    public Employee(String name, String department, int age, int YOE) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.YOE = YOE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYOE() {
        return YOE;
    }

    public void setYOE(int YOE) {
        this.YOE = YOE;
    }

    public String toString(){
        return name + " " + department + " " + age + " " + YOE;
    }
}
