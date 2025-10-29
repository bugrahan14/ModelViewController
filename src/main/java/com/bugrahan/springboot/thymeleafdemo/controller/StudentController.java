package com.bugrahan.springboot.thymeleafdemo.controller;

import com.bugrahan.springboot.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;




    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){

        // CREATE A STUDENT OBJECT
        Student theStudent = new Student();

        // ADD STUDENT OBJECT TO THE MODEL
        theModel.addAttribute("student", theStudent);

        // ADD MODEL İS COUNTRİES
        theModel.addAttribute("countries", countries);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent){

        // LOG THE İNPUT DATA
        System.out.println("theStudent: "+theStudent.getFirstName() + " " + theStudent.getLastName());

        return "student-confirmation";
    }





}
