package com.prameswaradev.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MusicController {

    @GetMapping("/")
    public String getSign(Model model){
        model.addAttribute("band", "brunomars");
        return "music";
    }


}
