package com.desafioitau.api.transferencia.controller;

import com.desafioitau.api.transferencia.dto.TransferenciaRequestDTO;
import com.desafioitau.api.transferencia.dto.TransferenciaResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class TransferenciaController {

    @PostMapping("/transferencia")
    public ResponseEntity<TransferenciaResponseDTO> efetuarTransferencia(@RequestBody TransferenciaRequestDTO transferenciaRequestDTO)
    {
        // implementar serviço de transferência

        // retornar o idTransferencia
        UUID uuid = UUID.randomUUID();
        TransferenciaResponseDTO transferenciaResponseDTO = new TransferenciaResponseDTO();
        transferenciaResponseDTO.setIdTransferencia(uuid);
        return ResponseEntity.ok().body(transferenciaResponseDTO);
    }
}
