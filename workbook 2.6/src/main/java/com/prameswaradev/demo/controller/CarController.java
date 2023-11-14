package com.prameswaradev.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    @GetMapping("/")
    public String getCar(Model model){
        model.addAttribute("budget", 8000);
        model.addAttribute("make", "Volkswagen");
        return "dealership";

    }


}
