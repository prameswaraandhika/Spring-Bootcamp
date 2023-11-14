package com.prameswaradev.demo.controller;

import com.prameswaradev.demo.model.Show;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class ShowController {

    @GetMapping("/")
    public ModelAndView getMovies(Model model){
        Map<String, Show> models = createShowMap();
//        param 1, untuk nama file.
//        param 2, untuk nama model.
        return new ModelAndView("show", models);
    }
    private Map<String, Show> createShowMap() {
        Map<String, Show> shows = new HashMap<>();
        shows.put("first", new Show(UUID.randomUUID(), "Breaking Bad", "Ozymandias", 10.0));
        shows.put("second", new Show(UUID.randomUUID(), "Attack on Titan", "Perfect Game", 9.9));
        shows.put("third", new Show(UUID.randomUUID(), "Game of Thrones", "Winter is Coming", 9.5));
        shows.put("fourth", new Show(UUID.randomUUID(), "Stranger Things", "Chapter One", 9.0));
        shows.put("fifth", new Show(UUID.randomUUID(), "The Mandalorian", "Chapter 1", 8.8));

        return shows;
    }

}
