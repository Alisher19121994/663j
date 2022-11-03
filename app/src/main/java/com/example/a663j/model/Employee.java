package com.example.a663j.model;

public class Employee {

    int id;
    String employee_name;
    String profile_image;
    int employee_salary;
    int employee_age;

    public Employee(int id, String employee_name, String profile_image, int employee_salary, int employee_age) {
        this.id = id;
        this.employee_name = employee_name;
        this.profile_image = profile_image;
        this.employee_salary = employee_salary;
        this.employee_age = employee_age;
    }

    public int getId() {
        return id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public int getEmployee_salary() {
        return employee_salary;
    }

    public int getEmployee_age() {
        return employee_age;
    }
}
