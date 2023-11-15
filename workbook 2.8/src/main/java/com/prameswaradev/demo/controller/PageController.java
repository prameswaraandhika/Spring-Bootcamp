package com.prameswaradev.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping(value="/")
    public String getLandingPage() {
        return "page";
    }

}
