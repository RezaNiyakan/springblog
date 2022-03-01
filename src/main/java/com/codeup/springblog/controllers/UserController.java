package com.codeup.springblog.controllers;

import com.codeup.springblog.repositories.PostRepository;
import com.codeup.springblog.repositories.UserRepository;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserRepository users;
    private PostRepository postDao;

    public UserController(UserRepository users, PostRepository postDao) {
        this.users = users;
        this.postDao = postDao;
    }
}
