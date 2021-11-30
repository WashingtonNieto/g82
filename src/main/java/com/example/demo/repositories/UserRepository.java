package com.example.demo.repositories;

import com.example.demo.models.User;
import com.example.demo.repositories.CRUD.IUserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    @Autowired
    private IUserCrudRepository userCrudRepository;
    public List<User> getAll(){
        return userCrudRepository.findAll();
    }

    public Optional<User> getById(Integer id){
        return userCrudRepository.findById(id);
    }

    public User save(User user){
        return userCrudRepository.save(user);
    }

    public void delete(Integer id){
        userCrudRepository.deleteById(id);
    }
  }
