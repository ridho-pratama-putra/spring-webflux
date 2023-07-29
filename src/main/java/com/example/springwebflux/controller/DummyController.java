package com.example.springwebflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dummy-controller")
public class DummyController {

    @GetMapping("/")
    public String helloDumy() {
        return "hello dummy";
    }
}
