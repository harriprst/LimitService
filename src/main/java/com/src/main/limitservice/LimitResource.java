package com.src.main.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitResource {

    @Autowired
    LimitsConfiguration config;


    @GetMapping("/limits")
    public Limits getConfiguration(){
        return new Limits(config.getMinimum(), config.getMaximum());
    }
}
