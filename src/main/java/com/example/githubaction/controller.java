package com.example.githubaction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/admin")
    public String admin() {
        return "Hello World from admin";
    }

    @GetMapping("/employee")
    public String employee() {
        return "Hello World from admin";
    }
}
