package com.quickfiller.payslip_api.core.model.cartao;

import java.util.List;

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
