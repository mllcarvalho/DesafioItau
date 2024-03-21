package com.desafioitau.api.transferencia.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteResponseDTO {

    private String id;
    private String nome;
    private String telefone;
    private String tipoPessoa;
}
