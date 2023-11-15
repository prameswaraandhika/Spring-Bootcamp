package com.prameswaradev.demo.controller;

import com.prameswaradev.demo.Utils;
import com.prameswaradev.demo.model.Record;
import com.prameswaradev.demo.model.ViewRecord;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class SalesController {

    @GetMapping("/")
    public String getSelling(Model model){
        List<Record> records = Arrays.asList(
                new Record("Chair", new BigDecimal("20.99"), new BigDecimal("5.99")),
                new Record("Table", new BigDecimal("40.99"), new BigDecimal("8.99")),
                new Record("Couch", new BigDecimal("100.99"), new BigDecimal("105.99")),
                new Record("Fridge", new BigDecimal("200.99"), new BigDecimal("59.99")),
                new Record("Bed", new BigDecimal("150.99"), new BigDecimal("205.99"))
        );

        List<ViewRecord> viewRecords = new ArrayList<>();
        for (Record record:
            records ) {
            viewRecords.add(new ViewRecord(
                    record.getItem(),
                    Utils.format(record.getRevenue()),
                    Utils.format(record.getCost()),
                    Utils.format(record.getRevenue().subtract(record.getCost()))
            ));
        }
        model.addAttribute("records", records);
        return "sales";
    }



}
