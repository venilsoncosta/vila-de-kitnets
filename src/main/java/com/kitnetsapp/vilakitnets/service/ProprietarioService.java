package com.kitnetsapp.vilakitnets.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitnetsapp.vilakitnets.entities.Proprietario;
import com.kitnetsapp.vilakitnets.repositories.ProprietarioRepository;

@Service
public class ProprietarioService {
    @Autowired
    private ProprietarioRepository proprietarioRepository;

    public List<Proprietario>  findAll(){
        return proprietarioRepository.findAll();
    }

    public Proprietario findById(Long id){
        Optional<Proprietario> obj = proprietarioRepository.findById(id);
        return obj.get();
    }
}
