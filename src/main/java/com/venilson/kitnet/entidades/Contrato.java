package com.venilson.kitnet.entidades;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Contrato {

    private Long id;
    private LocalDate dataInicio;
    private LocalDate dataFim;

}
