package com.prameswaradev.demo.controller;

import com.prameswaradev.demo.model.Divisi;
import com.prameswaradev.demo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Controller
public class EmployeeController {

    @GetMapping("/")
    public String getStaff(Model model){
        List<Employee> employees = Arrays.asList(
                new Employee("Jim Halpert", 32, "Salesman"),
                new Employee("Andy Bernard", 38, "Salesman"),
                new Employee("Pam Beesly", 32, "Receptionist"),
                new Employee("Michael Scott", 49, "Regional Manager"),
                new Employee("Ryan Howard", 28, "Temp"),
                new Employee("Angela Martin", 35, "Accountant"),
                new Employee("Dwight Schrute", 37, "Assistant to the Regional Manager")
        );
        List<Divisi> divisions =  Arrays.asList(
                new Divisi(UUID.randomUUID(), "Sales Division", 30),
                new Divisi(UUID.randomUUID(), "HR Division", 25),
                new Divisi(UUID.randomUUID(), "Engineering Division", 40)
                // Add more divisions as needed
        );
        model.addAttribute("divisions", divisions);
        model.addAttribute("employees", employees);
        return "staff";
    }



}
