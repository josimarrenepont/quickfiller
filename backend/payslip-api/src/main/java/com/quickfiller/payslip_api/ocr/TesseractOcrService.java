package com.quickfiller.payslip_api.ocr;

import com.quickfiller.payslip_api.core.port.OcrPort;
import com.quickfiller.payslip_api.shared.exception.OcrException;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.stereotype.Component;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@Component
public class TesseractOcrService implements OcrPort {

    private final Tesseract tesseract;

    public TesseractOcrService(Tesseract tesseract) {
        this.tesseract = tesseract;
    }

    @Override
    public String ocr(byte[] imageBytes) throws OcrException {

        try {

            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            BufferedImage bufferedImage = ImageIO.read(bais);

            if (bufferedImage == null) {
                throw new OcrException("Não foi possível ler os bytes da imagem.");
            }

            return tesseract.doOCR(bufferedImage);

        } catch (IOException | TesseractException e) {
            throw new OcrException("Falha ao executar OCR na imagem: " + e.getMessage());
        }
    }
}
