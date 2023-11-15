package com.prameswaradev.demo.model;

import lombok.Data;

@Data
public class Employee {
    String name;
    int age;
    String role;

    public Employee(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }
}
