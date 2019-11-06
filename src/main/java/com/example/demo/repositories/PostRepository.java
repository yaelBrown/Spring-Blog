package com.example.demo.repositories;

import com.example.demo.models.Post;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLInsert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PostRepository extends JpaRepository<Post, Long> {

//    Post findPostByTitle(String title);

    @Query("FROM post p where p.id = ?1")
    Post findPostById(Long id);

//    @SQLInsert(sql = "INSERT INTO posts (author, content, title) VALUES (?1, ?2, ?3)")
//    void addPost(String author, String content, String title);

//    @SQLDelete(sql = "DELETE FROM posts WHERE id = ?1")
//    Post deletePost(Long id);
}
