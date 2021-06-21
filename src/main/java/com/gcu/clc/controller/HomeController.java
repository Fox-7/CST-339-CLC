package com.gcu.clc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    // Show Login page.
    @GetMapping("/login")
    public String login() {
       return "/login";
    }
    
    // Show Home page.
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // Show Register page.
    @GetMapping("/register")
    public String register() {
       return "register";
    }
    
    @GetMapping("/doRegister")
    public String doRegister() {
       return "register";
    }
    
}	
