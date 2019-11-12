package com.example.demo.controllers;

import com.example.demo.models.Post;
import com.example.demo.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
class PostController {
    private final PostRepository postDao;

    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }

//    // This will return JSON data
//    @GetMapping("/posts")
//    @ResponseBody
//    public List<Post> getAllPosts() {
//        return postDao.findAll();
//    }

    @GetMapping("/posts")
    public String getAllPosts(Model vm) {
        vm.addAttribute("retrievedPosts", postDao.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/create")
    public String showCreatePostForm() {
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String createPost(
            @RequestParam String author,
            @RequestParam String title,
            @RequestParam String content) {
        Post p = new Post(author, title, content);
        postDao.save(p);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}")
    public String findPostById(Model vm, @PathVariable Long id) {
        vm.addAttribute("post", postDao.getOne(id));
        return "posts/post";
    }

    @GetMapping("/posts/{id}/edit")
    public String editPost(Model vm, @PathVariable Long id) {
        vm.addAttribute("post", postDao.getOne(id));
        return "posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String updatePost(@RequestParam String author,
                             @RequestParam String title,
                             @RequestParam String content) {
        Post p = new Post(author, title, content);
        return "redirect:/index";
    }

}