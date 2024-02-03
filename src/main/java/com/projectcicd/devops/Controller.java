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
//     echo "# Ci-Cd" >> README.md
// git init
// git add README.md
// git commit -m "first commit"
// git branch -M main
// git remote add origin https://github.com/NavinSingh111/Ci-Cd.git
// git push -u origin main
}
