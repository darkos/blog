package com.wp.blog.controller;

import com.wp.blog.domain.Post;
import com.wp.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/rest")
public class BlogPostRestController {

    @Autowired
    PostService postService;

    @GetMapping("/post/{id}")
    public Post getPost(@PathVariable UUID id) {
        Optional<Post> optionalPost =  postService.findForId(id);
//        if(optionalPost.isPresent()) {
//            return optionalPost.get();
//        }
        return optionalPost.get();

    }

}
