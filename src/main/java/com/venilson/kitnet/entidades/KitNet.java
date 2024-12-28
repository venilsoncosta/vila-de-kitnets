package com.venilson.kitnet.entidades;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class KitNet {

    private Long id;
    private Integer numero;
    private Double valor;
    private StatusApartamentoEnum status;
}
