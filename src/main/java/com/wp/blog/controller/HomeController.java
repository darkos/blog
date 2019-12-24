package com.wp.blog.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.Map;

@Controller
public class HomeController {

    @Value("${home.welcome}")
    private String homeWelcome = "WebPlease Blog";

    @GetMapping("/")
    public String home(Map<String, Object> model) {
        model.put("now", LocalDate.now());
        model.put("welcome ", this.homeWelcome);
        return "home";
    }
}
