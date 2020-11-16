package com.swann.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping(path = "/{userid}")
    public String getUser(@PathVariable String userid) {
        return "Get user id = " + userid;
    }

    @GetMapping
    public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
                           @RequestParam(value = "limit", defaultValue = "10") int limit) {
        return "Get users called page = " + page + "limit = " + limit;
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
