package com.robin;

import com.robin.exceptions.WrongPaymentAmountException;
import com.robin.task.Order;
import com.robin.task.OrderGetter;
import com.robin.task.Payment;

import java.io.FileNotFoundException;
import java.util.List;
// to jest branch poprawka
// Poprawka wysłana na branch
//nowe
public class Main {
    private static OrderGetter orderGetter;
    public static void main(String[] args)  {
        try {
            orderGetter = new OrderGetter("zamowienia.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Błąd wczytywania pliku");
            return;
        }
        List<Order> orderList = orderGetter.getOrdersFromFile();
        Payment payment = new Payment();
        for(Order o : orderList) {
            double value  = 0;
            try {
                value = payment.pay(o);
                System.out.println("Płacę przez internet "+ value+" "+o.getCustomer().getCountry().getCurrency().getName());
            } catch (WrongPaymentAmountException e) {
                e.printStackTrace();
                System.out.println("Płatnośc nie może być zrealizowana. Kwota zbyt wysoka lub zbyt niska");
            }

        }


    }
}
