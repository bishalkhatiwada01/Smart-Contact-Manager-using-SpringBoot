package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {

        System.out.println("Home Page Handler!!!");

        // Sending data to view
        model.addAttribute("name", "Bishal Khatiwada");
        model.addAttribute("youtubeChannel", "Bishal Tech");
        model.addAttribute("greeting", "Welcome to Spring Boot");

        return "home";

    }
}
