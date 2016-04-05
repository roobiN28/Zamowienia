package com.robin.model;

/**
 * Created by Rober on 17.03.2016.
 */
public class Tax {
    private double taxValue;

    public Tax(double taxValue) {
        this.taxValue = taxValue;
    }

    public double getTaxValue() {
        return taxValue;
    }

    public void encreaseTax(int percent) {
        taxValue += taxValue* (percent/100);
    }
}
