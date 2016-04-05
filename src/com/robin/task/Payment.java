package com.robin.task;

import com.robin.exceptions.WrongPaymentAmountException;
import com.robin.model.Country;
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
    public double pay (Order order) throws WrongPaymentAmountException {
        List<Package> list = order.getListPackage();
        double toPay=0;
        // sumuje kolejne paczki
        for(Package p : list) {
            int promotionPercent = PromotionCalculator.calculate(p);
            toPay += p.getAmount()*p.getItem().getPrice();
            toPay += promotionPercent*toPay;
        }
        // dodaje podatek do sumy
        toPay += (order.getCustomer().getCountry().getTax().getTaxValue()/100) * toPay;
        Country country = order.getCustomer().getCountry();
        if( isPaymentValueAcceptable(toPay , country)) {
            return toPay;
        }
        else {
            throw new WrongPaymentAmountException("Kwota zamówienia przekraczza:"+country.getMaxPaymentValue()+
            " , lub jest mniejsza od: "+country.getMinPaymentValue()+"\nKraj:"+country.getFullName()+", Kwota:"+
            toPay+", Waluta:"+country.getCurrency().getName());
        }

    }

    private boolean isPaymentValueAcceptable (double value, Country country) {
        if(country.getMinPaymentValue() == -1 && country.getMaxPaymentValue() == -1) {
            return true;

        }

        else if(country.getMaxPaymentValue() == -1) {
            if(value < country.getMinPaymentValue()) {
                return false;
            }
            return true;
        }

        else if(country.getMinPaymentValue() == -1) {
            if(value > country.getMaxPaymentValue()) {
                return false;
            }
            return true;
        }

        else if(value < country.getMinPaymentValue() || value > country.getMaxPaymentValue()) {
            return false;
        }
        else
            return true;
    }
}
