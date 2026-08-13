package com.quickfiller.payslip_api.api.handler;

import com.quickfiller.payslip_api.api.dto.ErrorResponseDTO;
import com.quickfiller.payslip_api.shared.exception.OcrException;
import com.quickfiller.payslip_api.shared.exception.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<ErrorResponseDTO> handleValidationException(ValidationException ex){
        ErrorResponseDTO erro = new ErrorResponseDTO(
                HttpStatus.BAD_REQUEST.value(),
                "Requisição Inválida",
                ex.getMessage()
        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
    }

    @ExceptionHandler(OcrException.class)
    public ResponseEntity<ErrorResponseDTO> handleOcrException(OcrException ex) {
        ErrorResponseDTO erro = new ErrorResponseDTO(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Erro de Processamento OCR",
                ex.getMessage()
        );
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(erro);
    }
}
