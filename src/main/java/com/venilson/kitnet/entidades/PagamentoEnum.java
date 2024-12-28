package com.venilson.kitnet.entidades;

public enum PagamentoEnum {

    PAGO("Pagamento realizado"),
    PENDENTE("Pagamento atrasado");

    private final String descricao;


    PagamentoEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
