package com.kitnetsapp.vilakitnets.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kitnetsapp.vilakitnets.entities.Inquilino;
import com.kitnetsapp.vilakitnets.service.InquilinoService;

@RestController
@RequestMapping("/inquilino")
public class InquiloController {
    @Autowired
    private InquilinoService service;

    @GetMapping
    public ResponseEntity<List<Inquilino>> findAll() {
        List<Inquilino> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Inquilino> findById(@PathVariable Long id) {
        Inquilino obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
