package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int(11) UNSIGNED")
    private long id;

    @Column(length = 100, nullable = false)
    private String author;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 255, nullable = false, columnDefinition = "TEXT")
    private String content;

    // Need a empty constructor to work with Spring.
    public Post() {}

    public Post(String author, String title, String content) {
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public Post(Long id, String author, String title, String content) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public Post(String id, String author, String title, String content) {
        this.id = Long.parseLong(id);
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void deletePost(Long id) {}
}

