package com.example.demo.repositories.CRUD;

import com.example.demo.models.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IPersonaCrudRepository extends MongoRepository<Persona, Integer> {
}
