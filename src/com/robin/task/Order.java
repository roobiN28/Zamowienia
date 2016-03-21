package com.robin.task;

import com.robin.model.Customer;
import com.robin.model.Package;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rober on 17.03.2016.
 */
public class Order {
    private Customer customer;
    private List<Package> listPackage;
    int id;

    public Order(Customer customer,int id) {
        this.customer = customer;
        listPackage = new ArrayList<>();
        this.id = id;
    }
    void addPackage(Package pac) {
        listPackage.add(pac);
    }

    public List<Package> getListPackage() {
        return listPackage;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder order = new StringBuilder();
        order.append("Order:"+id+"."+customer.getFirstName()+" "+customer.getLastName()+"\n");
        for(Package p : listPackage) {
            order.append("      --"+p.getItem().getName()+", price:"+p.getItem().getPrice()+", amount:"+p.getAmount()+"\n");
        }
        return order.toString();




    }
}
