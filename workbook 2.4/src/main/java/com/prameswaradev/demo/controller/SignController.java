package com.prameswaradev.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignController {

    @GetMapping("/")
    public String getSign(Model model){
        model.addAttribute("speed", 15);
        return "sign";
    }


}
