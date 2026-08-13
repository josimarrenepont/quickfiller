package com.quickfiller.payslip_api.core.port;

public interface PlanilhaGeneratorPort {
    byte[] gerar(Object data, String formato) throws Exception;
    String getFormato();
}
