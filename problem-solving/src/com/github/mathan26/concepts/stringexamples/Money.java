package com.github.mathan26.concepts.stringexamples;

public class Money {
    private final double amount;
    private final Currency currency;


    public Money(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }
}

