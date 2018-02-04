package com.enums;

public enum UsageType {



    PRIVATE("PRIVATE"),
    COMMERCIAL("COMMERCIAL");

    private String url;

    UsageType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
