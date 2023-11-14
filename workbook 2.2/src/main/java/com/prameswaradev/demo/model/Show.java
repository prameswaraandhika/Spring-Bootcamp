package com.prameswaradev.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class Show {
    private UUID id;
    private String name;
    private String episode;
    private Double rating;
}
