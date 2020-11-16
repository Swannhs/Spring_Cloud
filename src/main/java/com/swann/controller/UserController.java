package com.swann.controller;

import com.swann.entity.UserEntity;
import com.swann.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping(path = "/{userid}")
    public ResponseEntity<UserEntity> getUser(@PathVariable Long userid) {
        UserEntity entity = service.findById(userid);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @GetMapping
    public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
                           @RequestParam(value = "limit", defaultValue = "10") int limit,
                           @RequestParam(value = "sort", required = false) String sort) {
        return "Get users called page = " + page + " limit = " + limit + " sort = " + sort;
    }

    @PostMapping
    public ResponseEntity<?> postUser(@RequestBody UserEntity entity) {
        service.save(entity);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
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
