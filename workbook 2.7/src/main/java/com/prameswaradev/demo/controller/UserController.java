package com.prameswaradev.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String getName(Model model) {
        model.addAttribute("name", "Andhika");
        return "name-list";
    }


}
