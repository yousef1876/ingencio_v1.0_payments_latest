package com.enums;

public enum CustomerAddressStatus {

    none("NONE"),
    confirmed ("confirmed"),unconfirmed("unconfirmed") ;

    private String url;

    CustomerAddressStatus(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }


}
