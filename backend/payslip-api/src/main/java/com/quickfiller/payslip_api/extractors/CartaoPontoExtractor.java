package com.quickfiller.payslip_api.extractors;

import com.quickfiller.payslip_api.core.model.cartao.CartaoPonto;
import com.quickfiller.payslip_api.core.port.ExtratorPort;
import com.quickfiller.payslip_api.core.port.OcrPort;
import com.quickfiller.payslip_api.shared.exception.ExtractionException;
import org.springframework.stereotype.Component;

@Component
public class CartaoPontoExtractor implements ExtratorPort {

    private final OcrPort ocrService;

    public CartaoPontoExtractor(OcrPort ocrService) {
        this.ocrService = ocrService;
    }

    @Override
    public Object extrair(byte[] pdfBytes) throws ExtractionException {
        return new CartaoPonto();
    }

    @Override
    public String getTipo() {
        return "cartao-ponto";
    }
}
