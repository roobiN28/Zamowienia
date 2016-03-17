package com.robin.task;

import com.robin.model.Customer;
import com.robin.model.Package;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

/**
 * Created by Rober on 17.03.2016.
 */
public class Order {
    private Customer customer;
    private List<Package> listPackage;

    public Order(Customer customer) {
        this.customer = customer;
        listPackage = new ArrayList<>();
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
}
