package com.robin.task;

import com.robin.model.Package;

import java.util.List;

/**
 * Created by Rober on 21.03.2016.
 */
public class Payment {
    /**
     * Oblicza wartość zamówienia.
     *
     * @param order
     * @return
     */
    public double pay (Order order) {
        List<Package> list = order.getListPackage();
        double toPay=0;
        // sumuje kolejne paczki
        for(Package p : list) {
            toPay += p.getAmount()*p.getItem().getPrice();
        }
        // dodaje podatek do sumy
        toPay += (order.getCustomer().getCountry().getTax().getTaxValue()/100) * toPay;
        return toPay;

    }
}
