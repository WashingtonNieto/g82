package com.example.demo.services;

import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.getAll();
    }

    public Optional<User> getById(Integer id) {
        return userRepository.getById(id);
    }

    public User save(User user){

        if(user.getId() == null)
            return user;

        Optional<User> userExist = getById(user.getId());

        if (userExist.isPresent())
            return user;

        return userRepository.save(user);
    }

    public User update(User user){

        Optional<User> existePersona = getById(user.getId());
        if(existePersona.isEmpty()){
            return user;
        }

        return userRepository.save(user);
    }

    public void delete(Integer id){
        userRepository.delete(id);
    }





}
