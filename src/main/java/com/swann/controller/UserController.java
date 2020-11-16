package com.swann.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping(path = "/{userid}")
    public String getUser(@PathVariable String userid) {
        return "Get user id = " + userid;
    }

    @PostMapping
    public String postUser() {
        return "POST user";
    }

    @PutMapping
    public String putUser() {
        return "put user";
    }

    @DeleteMapping
    public String deleteUser() {
        return "Delete user";
    }
}
