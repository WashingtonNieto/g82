package com.example.demo.services;

import com.example.demo.models.Clothe;
import com.example.demo.repositories.ClotheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClotheService {

    @Autowired
    private ClotheRepository clotheRepository;

    public List<Clothe> getAll() {return clotheRepository.getAll();}


}
