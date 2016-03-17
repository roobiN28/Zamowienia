package com.robin.task;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Rober on 17.03.2016.
 */
public class OrderGetter {
    private BufferedReader bf;
    private String fileName;
    public OrderGetter(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        bf = new BufferedReader(new FileReader(fileName));

    }
    public List<Order> getOrdersFromFile() {
        List<Order> list = new ArrayList<>();
        Scanner s = new Scanner(bf);

        String firstName, lastName, itemName;
        int id,amount,price;





        return list;

    }

}
