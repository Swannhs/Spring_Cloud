package com.swann.service;

import com.swann.Repository.UserRepository;
import com.swann.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{
    @Autowired
    private UserRepository repository;

    public UserEntity findById(Long id){
        return repository.getById(id);
    }
    public void save(UserEntity entity){
        repository.save(entity);
    }
}
