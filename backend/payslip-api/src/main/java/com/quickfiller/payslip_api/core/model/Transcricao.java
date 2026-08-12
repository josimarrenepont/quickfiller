package com.quickfiller.payslip_api.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Transcricao {
    private String id;
    private String tipo;
    private String status;
    private String erro;
    private Object value;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
