package com.emeraldfashionblog.emeraldfashionblogcore.service;

import com.emeraldfashionblog.emeraldfashionblogcore.entity.Post;

import java.util.List;

public interface PostService {
    Post addPost();
    List<Post> getPosts();
}
