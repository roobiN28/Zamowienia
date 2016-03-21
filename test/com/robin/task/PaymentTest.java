package com.robin.task;

import org.junit.Test;

import java.util.List;

/**
 * Created by Rober on 21.03.2016.
 */
public class PaymentTest {

    @Test
    public void pay() throws Exception {
        OrderGetter orderGetter = new OrderGetter("Zamowienia.txt");
        List<Order> list = orderGetter.getOrdersFromFile();
        Payment payment = new Payment();
        for(Order o : list) {
            double value = payment.pay(o);
            System.out.println("Wartosc zamowienia nr."+o.getId()+", = "+value);
        }

    }
}