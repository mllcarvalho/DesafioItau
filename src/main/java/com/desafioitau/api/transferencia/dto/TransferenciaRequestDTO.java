package com.desafioitau.api.transferencia.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransferenciaRequestDTO {

    private String idCliente;
    private double valor;
    private Conta conta;

    public static class Conta {
        private String idOrigem;
        private String idDestino;
    }
}
