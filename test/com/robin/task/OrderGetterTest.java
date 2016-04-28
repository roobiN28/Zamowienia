package com.robin.task;

import com.robin.model.Item;
import org.junit.Assert;

import java.util.List;
/**
 * Created by Rober on 17.03.2016.
 */
public class OrderGetterTest {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void getOrdersFromFile() throws Exception {
        OrderGetter og = new OrderGetter("zamowienia.txt");
        List<Order> list = og.getOrdersFromFile();
        for(Order o : list) {
            //System.out.println(o.toString());
        }
        Assert.assertEquals("Liczba zamowien",list.size(),6);
        Item item = list.get(list.size()-1).getListPackage().get(0).getItem();
        Assert.assertEquals("Pierwszy przedmiot w ostatnim zamowieniu",item.getName(), "lustro");


    }
}