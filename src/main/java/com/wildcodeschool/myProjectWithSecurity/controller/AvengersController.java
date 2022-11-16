package com.wildcodeschool.myProjectWithSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvengersController {
    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avenger/assemble")
    public String admin() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String city() {
        return "Lyon, Nantes, Marseille, Toulouse";
    }
}
