package com.cydeo.controller;

import com.cydeo.bootStrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("mentor")
public class MentorControlller {

    @RequestMapping("/register")//localhost:8080/student/register
    public String register(Model model){

        return  "student/register";
    }


    @RequestMapping("/drope")//localhost:8080/student/register
    public String drop(){

        return  "student/register";
    }
}
