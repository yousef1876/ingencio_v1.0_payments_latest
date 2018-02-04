package com.enums;

public enum AcquireDescriptor {
    AIB("AIB"),
    AmericanExpress("AmericanExpress"),
    AtosOriginBNP("AtosOriginBNP"),Barclays("Barclays"),Catella("Catella"),CBA("CBA"),Elavon("Elavon"),FirstData("FirstData"),
    INICIS("INICIS"),JCB("JCB"),MerchantSolutions("MerchantSolutions"),Payvision("Payvision"),SEB("SEB"),Sub1("Sub1"),WellsFargo("WellsFargo"),

    eCard("eCard"),NordeaFinland("NordeaFinland"),iDeal("iDeal"),Aktia("Aktia"),SOFORT("SOFORT"),PayPal("PayPal"),WebMoney("WebMoney"),
    CashU("CashU"),Yandex("Yandex"),Alipay("Alipay"),BOKU("BOKU"),Qiwi("Qiwi"),Konbini("Konbini");

    private final String name;

    private AcquireDescriptor(String value) {
        this.name = value;
    }

    public String value() {
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }

}
