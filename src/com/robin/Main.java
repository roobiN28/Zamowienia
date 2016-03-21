package com.robin;

import com.robin.task.Order;
import com.robin.task.OrderGetter;
import com.robin.task.Payment;

import java.io.FileNotFoundException;
import java.util.List;

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
            double value  = payment.pay(o);
            System.out.println("Płacę przez internet "+ value+" "+o.getCustomer().getCountry().getCurrency().getName());
        }



    }
}
