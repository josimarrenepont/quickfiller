package com.quickfiller.payslip_api.ocr.config;

import net.sourceforge.tess4j.Tesseract;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OcrConfig {

    @Value("${tesseract.datapath:C:/Program Files/Tesseract-OCR/tessdata}")
    private String datapath;

    @Value("${tesseract.language:por}")
    private String language;

    @Bean
    public Tesseract tesseract() {
        Tesseract tesseract = new Tesseract();

        tesseract.setDatapath(datapath);

        tesseract.setLanguage(language);

        return tesseract;
    }
}
