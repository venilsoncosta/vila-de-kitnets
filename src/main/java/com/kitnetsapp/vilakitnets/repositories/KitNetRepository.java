package com.kitnetsapp.vilakitnets.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kitnetsapp.vilakitnets.entities.KitNet;

public interface KitNetRepository extends JpaRepository<KitNet, Long> {
    
}
