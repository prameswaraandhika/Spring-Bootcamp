package com.prameswaradev.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
public class Student{
    private UUID id;
    private String name;
    private String major;

    public Student() {

    }
}
