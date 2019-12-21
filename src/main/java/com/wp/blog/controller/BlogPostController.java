package com.wp.blog.controller;

import com.wp.blog.domain.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogPostController {

    @GetMapping("/addPost")
    public String sendAddBlogPostForm(Post post) {
        return "addPost";
    }

    @PostMapping("/addPost")
    public String processAddBlogPostForm(Post post) {
        return "addPostMessage";
    }

}
