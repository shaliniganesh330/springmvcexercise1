package com.stackroute.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    User user = new User();
    @RequestMapping(value = "/")
    public String greeting(ModelMap map){
        map.addAttribute("message",user.getUser());
        return "index";

    }
}
