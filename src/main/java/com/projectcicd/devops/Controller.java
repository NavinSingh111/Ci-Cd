package com.projectcicd.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller 
{

    @GetMapping("/name")
    public String getName(){
           return "In devops";
    }
}
