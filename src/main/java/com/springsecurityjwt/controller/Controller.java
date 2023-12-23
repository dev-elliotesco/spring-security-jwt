package com.springsecurityjwt.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class Controller {

    @PostMapping(value = "/demo")
    public String welcome() {
        return "Welcome from secure endpoint";
    }
}
