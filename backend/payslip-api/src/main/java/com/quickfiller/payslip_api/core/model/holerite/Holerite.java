package com.quickfiller.payslip_api.core.model.holerite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Holerite {
    private List<PaginaHolerite> pages;

    public static class PaginaHolerite{
        private int page;
        private String year;
        private String month;
        private List<VerbaHolerite> fields;
        private List<BaseHolerite> bases;
    }

    public static class VerbaHolerite{
        private String code;
        private String label;
        private String reference;
        private String value;
    }

    public static class BaseHolerite{
        private String label;
        private String value;
    }
}
