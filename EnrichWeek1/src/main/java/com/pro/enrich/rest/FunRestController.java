package com.pro.enrich.rest;


import org.springframework.web.bind.annotation.*;

@RestController
public class FunRestController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello world!";
    }
}
