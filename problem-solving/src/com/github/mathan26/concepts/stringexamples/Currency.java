package com.github.mathan26.concepts.stringexamples;

public final class Currency {
    private final String value;

    private Currency(String currencyValue) {
        value = currencyValue;
    }

    public static Currency of(String value) {
        return new Currency(value);
    }

    public String getValue() {
        return value;
    }
}
