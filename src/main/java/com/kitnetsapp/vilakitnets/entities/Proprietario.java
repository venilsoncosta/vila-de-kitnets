package com.kitnetsapp.vilakitnets.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_proprietario")
public class Proprietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String cpf;

    @OneToMany(mappedBy = "proprietario")
    private List<KitNet> kitnets;

    public Proprietario() {
    }

    public Proprietario(Long id, String name, String cpf, List<KitNet> kitnets) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.kitnets = kitnets;
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

    public List<KitNet> getKitnets() {
        return kitnets;
    }

    public void setKitnets(List<KitNet> kitnets) {
        this.kitnets = kitnets;
    }

    
    
}
