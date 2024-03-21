package com.desafioitau.api.transferencia.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaldoRequestDTO {

    private double valor;
    private String nomeDestino;

    public static class Conta {
        private String idOrigem;
        private String idDestino;
    }
}
