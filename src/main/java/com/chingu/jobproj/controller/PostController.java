package com.chingu.jobproj.controller;


import com.chingu.jobproj.repository.PostRepository;
import com.chingu.jobproj.model.Post;
import com.chingu.jobproj.repository.SearchRepository;
import io.swagger.v3.oas.annotations.Hidden;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @Hidden
    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts()
    {
        return repo.findAll();
    }

    @GetMapping("/post/{text}")
    public List<Post> findByText(@PathVariable String text)
    {
        return srepo.findByText(text);
    }

    @PostMapping("/addPost")
    public Post addPost(@RequestBody Post post)
    {
        return repo.save(post);
    }
}
