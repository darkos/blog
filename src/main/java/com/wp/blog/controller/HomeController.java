package com.wp.blog.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.wp.blog.domain.Post;
import com.wp.blog.repository.PostRepository;

@Controller
public class HomeController {

    @Value("${home.welcome}")
    private String homeWelcome = "WebPlease Blog";
    
    @Autowired
    private PostRepository postRepo;

    @GetMapping("/")
    public String siteRoot(Map<String, Object> model) {
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String home(Map<String, Object> model) {
    	List<Post> posts = postRepo.findAll();
        model.put("posts", posts);
        return "home";
    }
}
