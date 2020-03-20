package com.wp.blog.repository;

import java.util.UUID;

import com.wp.blog.domain.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {
//    @Modifying
//    @Query("update POST p set p.title = :title, p.body = :body, p.summary = :summary WHERE p.id = :id")
//    void updatePost(@Param("id") UUID id, @Param("title") String title, @Param("body") String body, @Param("summary") String summary);
}
