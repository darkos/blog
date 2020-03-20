package com.wp.blog.controller;

import com.wp.blog.domain.Post;
import com.wp.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

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
            return "addPost";
        } else {
            post = postService.save(post);
            return "addPostMessage";
        }
    }

    @GetMapping("/post/{id}")
    public String getPostWithId(@PathVariable UUID id, Map<String, Object> model) {
        Optional<Post> optionalPost = postService.findForId(id);
        if (optionalPost.isPresent()) {
            Post post = optionalPost.get();

            model.put("post", post);
            return "post";

        } else {
            return "error";
        }
    }

    @GetMapping("/editPost/{id}")
    public String editPost(@PathVariable UUID id, Map<String, Object> model) {
        Optional<Post> optionalPost = postService.findForId(id);
        if (optionalPost.isPresent()) {
            Post post = optionalPost.get();

            model.put("post", post);
            return "editPost";

        } else {
            return "error";
        }
    }

    @PostMapping("/updatePost")
    public String processUpdatePostForm(@Valid Post post, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addPost";
        } else {
            postService.updatePost(post);
            return "redirect:post/" + post.getId();
        }
    }

}
