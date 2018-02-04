package com.enums;

public enum PaymentProductFieldEnum {

    str("StringObj"),
    NUMERICSTRING("numericstring"),
    date("Date"),integer("Integer");

    private String url;

    PaymentProductFieldEnum(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }


}
