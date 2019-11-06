package com.example.demo.controllers;

import com.example.demo.models.Post;
import com.example.demo.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
class PostController {
    private final PostRepository postDao;

    PostController(PostRepository postDao) {
        this.postDao = postDao;
    }

    @GetMapping("/posts")
    @ResponseBody
    public List<Post> getAllPosts() {
        return postDao.findAll();
    }

}