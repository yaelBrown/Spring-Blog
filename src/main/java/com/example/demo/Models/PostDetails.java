package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "postDetails")
public class PostDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int(11) UNSIGNED")
    private long id;

    @Column(columnDefinition = "boolean", nullable = false)
    private boolean isAwesome;

    @Column(columnDefinition = "varchar(255)")
    private String historyOfPost;

    @Column(columnDefinition = "varchar(255)")
    private String topicDescription;

}