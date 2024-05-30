package com.kitnetsapp.vilakitnets.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_inquilino")
public class Inquilino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;

    
    @OneToOne
    @JoinColumn(name = "kitnet_id")
    private KitNet kitnet;

    public Inquilino(Long id, String name, String cpf, KitNet kitnet) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.kitnet = kitnet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public KitNet getApartamento() {
        return kitnet;
    }

    public void setApartamento(KitNet apartamento) {
        this.kitnet = apartamento;
    }

    
    
}
