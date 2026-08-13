package com.quickfiller.payslip_api.core.port;

import com.quickfiller.payslip_api.shared.exception.OcrException;

public interface OcrPort {
    String ocr(byte[] imageBytes) throws OcrException;
}
