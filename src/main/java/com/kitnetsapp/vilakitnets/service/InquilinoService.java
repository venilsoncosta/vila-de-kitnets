package com.kitnetsapp.vilakitnets.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitnetsapp.vilakitnets.entities.Inquilino;
import com.kitnetsapp.vilakitnets.repositories.InquilinoRepository;

@Service
public class InquilinoService {
    @Autowired
    private InquilinoRepository inquilinoRepository;

    public List<Inquilino> findAll(){
        return inquilinoRepository.findAll();
    }

    public Inquilino findById(Long id){
        Optional<Inquilino> obj = inquilinoRepository.findById(id);
        return obj.get();
    }
}
