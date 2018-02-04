package com.enums;

public enum MerchantActionType {


    REDIRECT("REDIRECT"),
    SHOW_INSTRUCTIONS("SHOW_INSTRUCTIONS"),
    SHOW_TRANSACTION_RESULTS("SHOW_TRANSACTION_RESULTS");

    private String url;

    MerchantActionType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }


}
