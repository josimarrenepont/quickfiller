package com.quickfiller.payslip_api.core.model.cartao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CartaoPonto {

    private List<PaginaPonto> pages;

    public static class PaginaPonto{
        private int pages;
        private List<DiaPonto> days;
    }

    public static class DiaPonto{
        private String date_raw;
        private List<BatidaPonto> punches;
    }

    public static class BatidaPonto{
        private String kind;
        private String time_raw;
        private String time_hhmm;
    }
}
