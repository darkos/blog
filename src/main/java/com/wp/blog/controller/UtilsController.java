package com.wp.blog.controller;

import com.wp.blog.domain.Post;
import com.wp.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class UtilsController {

    @Autowired
    PostService postService;


    @GetMapping("/utils/posts")
    public String getPostsAsInsertStatements(Map<String, Object> model) {
        StringBuffer sb = new StringBuffer();
        List<Post> posts = postService.findAll();
        for(Post post : posts) {
            sb.append("INSERT INTO POST (id,title, body, summary) values ('");
            sb.append(post.getId());
            sb.append("','");
            sb.append(post.getTitle());
            sb.append("','");
            sb.append(post.getBody());
            sb.append("','");
            sb.append(post.getSummary());
            sb.append("');\n");
        }
        model.put("postsAsInsert", sb.toString());
        System.out.println(sb.toString());
        return "/postsAsInsert";
    }


}
