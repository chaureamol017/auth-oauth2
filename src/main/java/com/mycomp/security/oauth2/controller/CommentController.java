package com.mycomp.security.oauth2.controller;


import com.mycomp.security.oauth2.model.Comment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class CommentController {


    @GetMapping
    public List<Comment> getAllComments() {
        final List<Comment> users = new ArrayList<>();

        users.add(new Comment(1L, "FirstUser"));

        return users;
    }
}
