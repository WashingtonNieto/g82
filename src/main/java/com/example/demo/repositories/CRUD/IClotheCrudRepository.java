package com.example.demo.repositories.CRUD;

import com.example.demo.models.Clothe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IClotheCrudRepository extends MongoRepository<Clothe, Integer> {
}
