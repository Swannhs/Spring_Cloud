package com.swann;

import com.swann.Repository.UserRepository;
import com.swann.entity.UserEntity;
import com.swann.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SwannApplicationTests {
    @Autowired
    private UserRepository repository;
    @Autowired
    private UserService service;

    @Test
    void contextLoads() {
        System.out.println(service.findById(1L));
    }

}
