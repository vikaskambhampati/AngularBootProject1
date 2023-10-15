package com.AngularSpringBoot.Project1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/angular")
public class HomeController {
    @GetMapping(value = "/home")
    public String homeMessage(){
        return "Home message";
    }
}
