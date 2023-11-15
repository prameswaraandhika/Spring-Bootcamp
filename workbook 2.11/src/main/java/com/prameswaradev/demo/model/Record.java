package com.prameswaradev.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;


@Data
public class Record {
    private String item;
    private BigDecimal revenue;
    private BigDecimal cost;
    private BigDecimal profit;

    public Record(String item, BigDecimal revenue, BigDecimal cost) {
        this.item = item;
        this.revenue = revenue;
        this.cost = cost;
        this.profit = revenue.subtract(cost);
    }
}