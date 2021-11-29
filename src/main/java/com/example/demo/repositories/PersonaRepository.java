package com.example.demo.repositories;

import com.example.demo.models.Persona;
import com.example.demo.repositories.CRUD.IPersonaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PersonaRepository {

    @Autowired
    private IPersonaCrudRepository personaCrudRepository;
    public List<Persona> getAll(){
        return personaCrudRepository.findAll();
    }

    public Optional<Persona> getById(Integer id){
        return personaCrudRepository.findById(id);
    }

    public Persona save(Persona persona){
        return personaCrudRepository.save(persona);
    }

    public void delete(Integer id){
        personaCrudRepository.deleteById(id);
    }
  }
