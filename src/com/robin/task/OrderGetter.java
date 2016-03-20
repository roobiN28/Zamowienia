package com.robin.task;

import com.robin.model.Customer;
import com.robin.model.Item;
import com.robin.model.Package;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
    //slabo zaprojektowana funkcja, nieodporna na zle dane
    public List<Order> getOrdersFromFile() {
        Repository repo = Repository.getInstance();
        List<Order> list = new ArrayList<>();
        Scanner s = new Scanner(bf);

        Customer customer;
        Item item;
        Package pac;
        Order order=null;

        String firstName, lastName, itemName;
        int id,amount,price;
        int currentId =0;
        while(s.hasNext()) {
            lastName = s.next();
            firstName = s.next();
            id = s.nextInt();
            amount = s.nextInt();
            itemName = s.next();
            price = s.nextInt();

            customer = repo.getCustomer(firstName,lastName);
            item = new Item(itemName,price);
            pac = new Package(item,amount);

            if(id != currentId) {
                if(currentId != 0)
                    list.add(order);

                order = new Order(customer,id);
                currentId = id;

            }
            order.addPackage(pac);
        }
        list.add(order);





        return list;
    }

}
