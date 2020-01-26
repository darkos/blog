package com.wp.blog.service.impl;

import com.wp.blog.domain.Post;
import com.wp.blog.repository.PostRepository;
import com.wp.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    @Override
    public Optional<Post> findForId(UUID id) {
        return postRepository.findById(id);
    }

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public void updatePost(Post post) {
        Optional<Post> optionalPostToUpdate = postRepository.findById(post.getId());
        Post  postToUpdate = optionalPostToUpdate.get();
        postToUpdate.setTitle(post.getTitle());
        postToUpdate.setBody(post.getBody());
        postToUpdate.setSummary(post.getSummary());
        postRepository.save(postToUpdate);
        postRepository.flush();
//        postRepository.save(post.getId(), post.getTitle(), post.getBody(), post.getSummary());
    }
}
