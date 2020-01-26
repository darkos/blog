package com.wp.blog.service;

import com.wp.blog.domain.Post;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PostService {

    Post save(Post post);
    Optional<Post> findForId(UUID id);
    List<Post> findAll();

}
