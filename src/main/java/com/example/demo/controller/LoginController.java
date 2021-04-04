package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }
    @GetMapping("/access-denied")
    public String deniedPage(){
        return "deniedPage";
    }

}
