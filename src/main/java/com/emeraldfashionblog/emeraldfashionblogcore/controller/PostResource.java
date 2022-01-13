package com.emeraldfashionblog.emeraldfashionblogcore.controller;

import com.emeraldfashionblog.emeraldfashionblogcore.entity.Post;
import com.emeraldfashionblog.emeraldfashionblogcore.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/post")
@CrossOrigin(origins = "http://localhost:4209")
public class PostResource {
    @Autowired
    PostService postService;

    @PostMapping("/addPost")
    public ResponseEntity<Post> addPost() {
        return new ResponseEntity<Post>(postService.addPost(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/getPosts")
    public List<Post> getPosts() {
        return postService.getPosts();
    }
}
