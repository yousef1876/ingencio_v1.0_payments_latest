package com.enums;

public enum TransactionType {

    FIRSTPAYMENT("FIRSTPAYMENT"),
    NTHPAYMENT("NTHPAYMENT"),
    REPRESENTED("REPRESENTED"),
    FINALPAYMENT("FINALPAYMENT"),
    NEW_OR_REINSTATED("NEW_OR_REINSTATED"),Cancellation("Cancellation");

    private String url;

    TransactionType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }


}
