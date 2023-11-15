package com.prameswaradev.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ViewRecord {
    private String item;
    private String revenue;
    private String cost;
    private String profit;

}
