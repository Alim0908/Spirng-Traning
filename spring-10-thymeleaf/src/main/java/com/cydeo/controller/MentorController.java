package com.cydeo.controller;

import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register") //localhost:8080/mentor/register
    public String register(Model model) {
        List<String> batchList = Arrays.asList("JD1","JD2","JD3");
        model.addAttribute("batchList", batchList);

        model.addAttribute("mentor", new Mentor());
//        after we register all the information , this attrubuteName:"mentor" will store all the information we puted like, firstname , lastname...
        return "mentor/mentor-register";
    }
    @PostMapping("/confirm")
    public String submitForm(@ModelAttribute("mentor") Mentor mentor, Model model) {
        // how can i access  these mentor attributes dwe input in the browser
        //by putting @ModelAttribute("mentor") Mentor mentor to the parameter

    //    model.addAttribute("mentor", new Mentor());
        //WE PUT THIS  new object to get empty form after one mentor registerd


//        return "mentor/mentor-confirmation";
   //     return "mentor/mentor-register";
        return  "redirect:/mentor/register";
    }


}
