package com.quickfiller.payslip_api.planilha;

import com.quickfiller.payslip_api.core.port.PlanilhaGeneratorPort;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;

@Component
public class CsvPlanilhaGenerator implements PlanilhaGeneratorPort {

    @Override
    public byte[] gerar(Object data, String formato) throws Exception {
        StringBuilder csvBuilder = new StringBuilder();
        csvBuilder.append("coluna1;coluna2;coluna3\n");

        return csvBuilder.toString().getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public String getFormato() {
        return "csv";
    }
}
