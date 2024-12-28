package com.venilson.kitnet.entidades;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Inquilino {

    private Long id;
    private String nome;
    private String cpf;
    private String rg;
    private LocalDateTime dataDeNascimento;
    private String contato;
    private String email;
}
