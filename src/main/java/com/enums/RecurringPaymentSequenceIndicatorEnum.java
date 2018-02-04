package com.enums;

public enum RecurringPaymentSequenceIndicatorEnum {

    FIRST("FIRST"),
    Recurring("Recurring"),
    LAST("LAST");

    private String url;

    RecurringPaymentSequenceIndicatorEnum(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
