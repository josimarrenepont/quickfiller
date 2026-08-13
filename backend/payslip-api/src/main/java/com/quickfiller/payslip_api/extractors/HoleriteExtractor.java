package com.quickfiller.payslip_api.extractors;

import com.quickfiller.payslip_api.core.model.holerite.Holerite;
import com.quickfiller.payslip_api.core.port.ExtratorPort;
import com.quickfiller.payslip_api.core.port.OcrPort;
import com.quickfiller.payslip_api.shared.exception.ExtractionException;
import org.springframework.stereotype.Component;

@Component
public class HoleriteExtractor implements ExtratorPort {

    private final OcrPort ocrService;

    public HoleriteExtractor(OcrPort ocrService) {
        this.ocrService = ocrService;
    }

    @Override
    public Object extrair(byte[] pdfBytes) throws ExtractionException {
        return new Holerite();
    }

    @Override
    public String getTipo() {
        return "holerite";
    }
}
