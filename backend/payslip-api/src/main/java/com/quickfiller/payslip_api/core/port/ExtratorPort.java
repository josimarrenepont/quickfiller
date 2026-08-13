package com.quickfiller.payslip_api.core.port;

import com.quickfiller.payslip_api.shared.exception.ExtractionException;

public interface ExtratorPort {
    Object extrair(byte[] pdfBytes) throws ExtractionException;
    String getTipo();
}
