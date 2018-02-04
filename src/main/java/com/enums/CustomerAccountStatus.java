package com.enums;



public enum CustomerAccountStatus {

    VERIFIED("verified"),
    UNVERIFIED("UNVERIFIED");

    private String url;

    CustomerAccountStatus(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
