package com.robin.model;

import com.robin.task.Repository;

/**
 * Created by Rober on 17.03.2016.
 */
public class Country {
    private String fullName;
    private String shortName;
    private Currency currency;
    private double maxPaymentValue;
    private double minPaymentValue;
    private Tax tax;

    public Country(String fullName, String shortName, Currency currency, Tax tax) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.currency = currency;
        this.tax = tax;
        // jesli nie ustawwione to -1
        maxPaymentValue = -1;
        minPaymentValue = -1;
    }

    public Country(String fullName, String shortName, Currency currency, double maxPaymentValue, double minPaymentValue, Tax tax) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.currency = currency;
        this.maxPaymentValue = maxPaymentValue;
        this.minPaymentValue = minPaymentValue;
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
fsadfsdf
    public void translateCurrency(Currency currency) {
        Repository repo = Repository.getInstance();
        Currency defaultCurrency = repo.getDefaultCurrency();
        if(  !defaultCurrency.getName().toLowerCase().equals(  defaultCurrency.getName().toLowerCase()  )  ) {
            double value;
            value = this.currency.getExchangeValue();
            value = value * 1/currency.getExchangeValue();
            value+= value*0.05;
            Currency curr = new Currency(value, currency.getName());
            this.currency = curr;
        }

    }

    public double getMinPaymentValue() {
        return minPaymentValue;
    }

    public void setMinPaymentValue(double minPaymentValue) {
        this.minPaymentValue = minPaymentValue;
    }

    public double getMaxPaymentValue() {
        return maxPaymentValue;
    }

    public void setMaxPaymentValue(double maxPaymentValue) {
        this.maxPaymentValue = maxPaymentValue;
    }
}
