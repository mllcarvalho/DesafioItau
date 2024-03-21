package com.desafioitau.api.transferencia.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaResponseDTO {

    private String id;
    private double saldo;
    private double limiteDiario;
    private boolean ativo;
}
