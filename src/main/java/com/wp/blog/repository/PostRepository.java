package com.wp.blog.repository;

import com.wp.blog.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {
//    @Modifying
//    @Query("update POST p set p.title = :title, p.body = :body, p.summary = :summary WHERE p.id = :id")
//    void updatePost(@Param("id") UUID id, @Param("title") String title, @Param("body") String body, @Param("summary") String summary);
}
