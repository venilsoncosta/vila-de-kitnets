package com.kitnetsapp.vilakitnets.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitnetsapp.vilakitnets.entities.KitNet;
import com.kitnetsapp.vilakitnets.repositories.KitNetRepository;

@Service
public class KitNetService {
    @Autowired
    private KitNetRepository kitnetRepository;

    public List<KitNet> findAll() {
        return kitnetRepository.findAll();
    }

    public KitNet findById(Long id){
        Optional<KitNet> obj = kitnetRepository.findById(id);
        return obj.get();
    }
}
