package com.robin.task;

import com.robin.model.Country;
import com.robin.model.Currency;
import com.robin.model.Customer;
import com.robin.model.Tax;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rober on 17.03.2016.
 */
public class Repository {
    private static Repository instance = new Repository();
    private List<Customer> listCustomer;
    public static Repository getInstance() {
        return instance;
    }

    private Repository() {
        Currency pln = new Currency(1,"PLN");
        Currency gbp = new Currency(6,"GBP");
        Tax polandTax = new Tax(20);
        Tax greatBritainTax = new Tax(40);
        Country poland = new Country("Poland","PL",pln,polandTax);
        Country greatBritain = new Country("Great Britain", "EN",gbp,greatBritainTax);
        Customer marcinTokar = new Customer("Marcin","Tokar",poland);
        Customer piotrOmiotek = new Customer("Piotr","Omiotek",poland);
        Customer johnSmith = new Customer("John", "Smith",greatBritain);
        listCustomer= new ArrayList<>();
        listCustomer.add(marcinTokar);
        listCustomer.add(piotrOmiotek);
        listCustomer.add(johnSmith);

    }
    Customer getCustomer(String firstName,String lastName) {
        for(Customer c : listCustomer) {
            if(firstName.equals(c.getFirstName()) && lastName.equals(c.getLastName())) {
                return c;
            }
        }
        return null;
    }
}
