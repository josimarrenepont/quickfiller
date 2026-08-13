package com.quickfiller.payslip_api.planilha;

import com.quickfiller.payslip_api.core.port.PlanilhaGeneratorPort;
import com.quickfiller.payslip_api.shared.exception.ExtractionException;
import tools.jackson.databind.ObjectMapper;

public class JsonPlanilhaGenerator implements PlanilhaGeneratorPort {

    private final ObjectMapper objectMapper;

    public JsonPlanilhaGenerator(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public byte[] gerar(Object data, String formato) throws Exception {
        try{
            return objectMapper.writeValueAsBytes(data);
        } catch (Exception e){
            throw new ExtractionException("Erro ao serializar dados para JSON", e);
        }
    }

    @Override
    public String getFormato() {
        return "json";
    }
}
