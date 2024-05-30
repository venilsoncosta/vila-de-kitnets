package com.kitnetsapp.vilakitnets.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kitnetsapp.vilakitnets.entities.KitNet;
import com.kitnetsapp.vilakitnets.service.KitNetService;

@RestController
@RequestMapping("/kitnets")
public class KitNetController {
        @Autowired
        private KitNetService service;

        @GetMapping
        public ResponseEntity<List<KitNet>> findAll(){
            List<KitNet> list = service.findAll();
            return ResponseEntity.ok().body(list);
        }

        @GetMapping(value = "/{id}")
        public ResponseEntity<KitNet> findById(@PathVariable Long id){
            KitNet obj = service.findById(id);
            return ResponseEntity.ok().body(obj);
        }
}
