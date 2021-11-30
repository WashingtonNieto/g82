package com.example.demo.repositories;

import com.example.demo.models.Clothe;
import com.example.demo.repositories.CRUD.IClotheCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClotheRepository {

    @Autowired
    private IClotheCrudRepository clotheCrudRepository;
    public List<Clothe> getAll(){
        return clotheCrudRepository.findAll();
    }

    public Optional<Clothe> getById(Integer id){
        return clotheCrudRepository.findById(id);
    }

    public Clothe save(Clothe clothe){
        return clotheCrudRepository.save(clothe);
    }

    public void delete(Integer id){
        clotheCrudRepository.deleteById(id);
    }


}
