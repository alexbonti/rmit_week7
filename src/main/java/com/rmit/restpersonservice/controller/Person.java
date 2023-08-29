package com.rmit.restpersonservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Person {

    @GetMapping
    public String Welcome(){
        return "Welcome!";
    }

    @GetMapping("/greetings")
    public String Greet(@RequestParam String name){
        return "Hello to you my dear visitor " +name;
    }


}
