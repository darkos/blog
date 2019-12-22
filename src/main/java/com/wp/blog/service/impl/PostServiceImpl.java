package com.wp.blog.service.impl;

import com.wp.blog.domain.Post;
import com.wp.blog.repository.PostRepository;
import com.wp.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post save(Post post) {
        return postRepository.saveAndFlush(post);
    }
}
