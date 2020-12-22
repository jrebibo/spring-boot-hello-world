package com.app.springboothelloworld;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationApiController {

    @RequestMapping("/")
    public String index() {
        return "Hello World! - Spring Boot Web Application";
    }



}
