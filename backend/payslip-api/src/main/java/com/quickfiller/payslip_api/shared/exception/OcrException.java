package com.quickfiller.payslip_api.shared.exception;

public class OcrException extends RuntimeException{
    public OcrException(String message){
        super(message);
    }
}
