package com.quickfiller.payslip_api.extractors.factory;

import com.quickfiller.payslip_api.core.port.ExtratorPort;
import com.quickfiller.payslip_api.shared.exception.ValidationException;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ExtratorFactory {

    private final Map<String, ExtratorPort> extratores;

    public ExtratorFactory(Map<String, ExtratorPort> extratores) {
        this.extratores = extratores;
    }

    public ExtratorPort getExtrator(String tipo){
        ExtratorPort extrator = extratores.get(tipo);
        if(extrator == null){
            throw new ValidationException("Tipo de documento inválido: " + tipo);
        }
        return extrator;
    }
}
