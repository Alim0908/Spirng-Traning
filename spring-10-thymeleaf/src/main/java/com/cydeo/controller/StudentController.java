package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/student")
public class StudentController {

    //    @RequestMapping(value = "/register",method = RequestMethod.GET) //localhost:8080/student/register
    @RequestMapping("/register") //localhost:8080/student/register
    @GetMapping("/register") // @GetMapping includes @RequestMapping("/register")+ method = RequestMethod.GET)
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());

        return "student/register";
    }

    @RequestMapping(value = "/welcome",method = RequestMethod.POST) //localhost:8080/student/welcome?name=Ozzy
   @PostMapping("/welcome")//  @PostMapping("/welcome") includes  @RequestMapping(value = "/welcome"+method = RequestMethod.POST
    public String welcome(){


        return "student/welcome";
    }
}
