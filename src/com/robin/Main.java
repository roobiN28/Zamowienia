package com.robin;

import com.robin.task.OrderGetter;

import java.io.FileNotFoundException;

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
        orderGetter.getOrdersFromFile();



    }
}
