package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")
public String getHomePage(){
    return "home.html";
}
    @RequestMapping("/Alim")
    public String getHomePage2(){
        return "home.html";
    }
    @RequestMapping({"/apple","/orange"})
    public String getHomePage3(){
        return "home.html";
    }
    @RequestMapping("/banana")
    public String getLogInPage(){
        return "login.html";
    }

}
