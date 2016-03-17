package com.robin.model;

import sun.util.resources.cldr.ebu.CurrencyNames_ebu;

/**
 * Created by Rober on 17.03.2016.
 */
public class Country {
    private String fullName;
    private String shortName;
    private Currency currency;

    public Country(String fullName, String shortName, Currency currency) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.currency = currency;
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
}
