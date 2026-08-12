package com.quickfiller.payslip_api.core.port;

public interface ExtratorPort {
    Object extrair(byte[] pdfBytes) throws ExtractionException;
    String getTipo();
}
