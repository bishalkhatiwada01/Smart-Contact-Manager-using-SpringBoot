package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

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

    @RequestMapping("/about")
    public String aboutPage() {
        System.out.println("About Page Loading!!!");
        return "about";
    }

    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("Services Page Loading!!!");
        return "services";
    }

    @GetMapping("/contact")
    public String contactPage() {
        return new String("contact");
    }

    @GetMapping("/login")
    public String loginPage() {
        return new String("login");
    }

    @GetMapping("/signup")
    public String signupPage() {
        return new String("signup");
    }
}
