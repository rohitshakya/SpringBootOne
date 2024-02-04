package com.myspring.firstspringproject.controllers;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@ResponseBody
public class HomeController {

   @GetMapping("/firstFunction/{number}")
   public String firstFunction(@PathVariable String number) {

        System.out.println(number);
       return "hello world"+ number;
   }
    @GetMapping("/greet/{firstName}")
    public String greetWithMultipleParams(
            @PathVariable String firstName,
            @RequestParam String lastName,
            @RequestParam int age) {

        return "Hello, " + firstName + " " + lastName + "! You are " + age + " years old.";
    }
   
}
