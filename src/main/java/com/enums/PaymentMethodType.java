package com.enums;

public enum PaymentMethodType {

    CARD("CARD"),
    DirectDebit("DirectDebit"),
    OnlineBankTransfer("OnlineBankTransfer"),Invoice("Invoice"),BankTransfer("BankTransfer"),Redirect("Redirect"),
    Cash("Cash");

    private String url;

    PaymentMethodType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
