package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestViewController {

    private final UserService userService;


    public RestViewController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/admin")
    public String admin(Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        model.addAttribute("user",userService.getUserByUsername(auth.getName()));
        return "restAdmin";
    }
    @GetMapping("/user")
    public String user(Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        model.addAttribute("user",userService.getUserByUsername(auth.getName()));
        return "restUser";
    }
}
