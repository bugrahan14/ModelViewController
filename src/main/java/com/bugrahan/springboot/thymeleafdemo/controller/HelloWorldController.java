package com.bugrahan.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    // need a controller method to show initial HTML form
    @RequestMapping("/showForm")
    public String showForm(){

        return "helloworld-form";
    }

    // need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm(){

        return "helloworld";
    }


    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request , Model model){

        // READ THE RREQUEST PARAMETER FROM THE HTML FORM
        String theName = request.getParameter("studentName");

        // CONVERT THE DATA TO ALL CAPS
        theName = theName.toUpperCase();

        // CREATE THE MESSAGE
        String result = "HEY !!" + theName;

        // ADD THE MESSAGE TO THE MODEL
        model.addAttribute("message" , result);

        return "helloworld";


    }


    // @RequestParam("studentName") String theName
    @RequestMapping("/processFormVersionThree")
    public String letsShoutDudeVersionThree(@RequestParam String studentName, Model model){


        // CONVERT THE DATA TO ALL CAPS
        studentName = studentName.toUpperCase();

        // CREATE THE MESSAGE
        String result = "HEY VERSİON 3 REQUEST PARAM !!" + studentName;

        // ADD THE MESSAGE TO THE MODEL
        model.addAttribute("message" , result);

        return "helloworld";


    }

}













