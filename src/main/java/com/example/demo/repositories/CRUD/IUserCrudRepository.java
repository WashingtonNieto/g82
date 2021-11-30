package com.example.demo.repositories.CRUD;

import com.example.demo.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserCrudRepository extends MongoRepository<User, Integer> {
}
