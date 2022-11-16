package com.wildcodeschool.myProjectWithSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!!! <a href='/admin'>admin</a>";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello Admin!!!";
}
}
