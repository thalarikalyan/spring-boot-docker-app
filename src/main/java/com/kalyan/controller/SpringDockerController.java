package com.kalyan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springDocker")
public class SpringDockerController {


    @GetMapping("/getMessage")
    public String getMessage(){
        return "Welcome to Spring boot Docker Application:";
    }
}

