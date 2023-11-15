package com.prameswaradev.demo.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Divisi {
    private UUID id;
    private String name;
    private int count;

    public Divisi(UUID id, String name, int count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }
}
