package com.kitnetsapp.vilakitnets.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kitnetsapp.vilakitnets.entities.Proprietario;
import com.kitnetsapp.vilakitnets.service.ProprietarioService;

@RestController
@RequestMapping("/proprietarios")
public class ProprietarioController {
    @Autowired
    private ProprietarioService service;

    @GetMapping
    public ResponseEntity<List<Proprietario>> findAll() {
        List<Proprietario> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Proprietario> findById(@PathVariable Long id) {
        Proprietario obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
