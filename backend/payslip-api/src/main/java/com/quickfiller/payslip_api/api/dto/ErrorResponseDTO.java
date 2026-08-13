package com.quickfiller.payslip_api.api.dto;

import java.time.LocalDateTime;

public record ErrorResponseDTO(
        int status,
        String erro,
        String mensagem,
        LocalDateTime timestamp
) {
    public ErrorResponseDTO(int status, String erro, String mensagem){
        this(status, erro, mensagem, LocalDateTime.now());
    }
}
