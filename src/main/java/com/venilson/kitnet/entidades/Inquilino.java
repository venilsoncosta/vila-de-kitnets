package com.venilson.kitnet.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Inquilino {

    private Long id;
    private String nome;
    private String cpf;
    private String rg;
    private LocalDateTime dataDeNascimento;
    private String contato;
    private String email;
}
