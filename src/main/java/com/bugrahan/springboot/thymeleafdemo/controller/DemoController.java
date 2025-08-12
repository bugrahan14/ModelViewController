package com.bugrahan.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Controller
public class DemoController {

    @GetMapping("/hello")
    public String sayHello(Model theModel){

        theModel.addAttribute("theDate" , LocalDateTime.now());

        return "helloworld";


    }

}
