package com.emeraldfashionblog.emeraldfashionblogcore.serviceimpl;

import com.emeraldfashionblog.emeraldfashionblogcore.entity.Post;
import com.emeraldfashionblog.emeraldfashionblogcore.repository.PostRepository;
import com.emeraldfashionblog.emeraldfashionblogcore.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;

    @Override
    public Post addPost() {
        Post post = new Post();
        post.setBody("Angular test");
        postRepository.save(post);
        return post;
    }

    @Override
    public List<Post> getPosts() {
        List<Post> posts = new ArrayList<>();
        Iterable<Post> postsIterable = postRepository.findAll();
        for(Post post: postsIterable) {
            posts.add(post);
        }
        return posts;
    }
}
