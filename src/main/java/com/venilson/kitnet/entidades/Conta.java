package com.venilson.kitnet.entidades;

import java.time.LocalDate;

public class Conta {

    private Long id;
    private String descricao;
    private Double valor;
    private LocalDate dataVencimento;
    private Pagamento pagamento;
}
