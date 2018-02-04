package com.enums;

public enum PurchaseTypeEnum {

    Goods("Goods"),
    Services("Services");

    private String url;

    PurchaseTypeEnum(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
