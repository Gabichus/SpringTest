package com.example.springtest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping
    public String getTest() {
        return "GET TEST";
    }

    @PostMapping
    public String postTest() {
        return "Success";
    }
}
