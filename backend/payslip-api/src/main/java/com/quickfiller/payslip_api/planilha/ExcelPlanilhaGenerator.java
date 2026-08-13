package com.quickfiller.payslip_api.planilha;

import com.quickfiller.payslip_api.core.port.PlanilhaGeneratorPort;
import org.springframework.stereotype.Component;

@Component
public class ExcelPlanilhaGenerator implements PlanilhaGeneratorPort {

    private byte[] bytes;

    @Override
    public byte[] gerar(Object data, String formato) throws Exception {
        return bytes;
    }

    @Override
    public String getFormato() {
        return "xlsx";
    }
}
