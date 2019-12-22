package com.wp.blog.controller;

import com.wp.blog.domain.Post;
import com.wp.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class BlogPostController {

    private PostService postService;

    @Autowired
    public BlogPostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/addPost")
    public String sendAddBlogPostForm(Post post) {
        return "addPost";
    }

    @PostMapping("/addPost")
    public String processAddBlogPostForm(@Valid Post post, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/addPost";
        } else {
            post = postService.save(post);
            return "addPostMessage";
        }
//        return "addPostMessage";
    }

}
