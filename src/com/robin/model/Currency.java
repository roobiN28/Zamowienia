package com.robin.model;

/**
 * Created by Robert on 17.03.2016.
 */
public class Currency {
    private String name;
    private double exchangeValue;

    public Currency(double exchangeValue, String name) {
        this.exchangeValue = exchangeValue;
        this.name = name;
    }

    public void adb () {

    }

    public double getExchangeValue() {
        return exchangeValue;
    }

    public void setExchangeValue(double exchangeValue) {
        this.exchangeValue = exchangeValue;
    }

    public String getName() {
        return name;
    }
}
