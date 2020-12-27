package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.AccessControlContext;

@RestController
public class DemoRestController {

    @GetMapping("/demo2")
    public String getDemoString() {
        return "Это DEMO2!";
    }
}
