package com.example.demo.repositories;

import com.example.demo.models.Post;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLInsert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    Post findPostByTitle(String title);

    @Query(value = "SELECT * FROM Posts WHERE id = ?", nativeQuery = true)
    Post findAllById(Long id);
}