package com.crud.backend.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    @PreAuthorize("hasRole('CLIENT')")
    public String home(){
        return "home";
    }

    @GetMapping("/accessDenied")
    public String accessDenied(){ return  "accessDenied"; }
}
