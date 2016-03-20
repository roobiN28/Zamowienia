package com.robin.model;

/**
 * Created by Rober on 17.03.2016.
 */
public class Country {
    private String fullName;
    private String shortName;
    private Currency currency;
    private Tax tax;

    public Country(String fullName, String shortName, Currency currency, Tax tax) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.currency = currency;
        this.tax = tax;
    }

    public String getFullName() {
        return fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }
}
