package com.robin.model;

/**
 * Created by Rober on 17.03.2016.
 */
public class Package {
    private Item item;
    private int amount;

    public Package(Item item, int amount) {
        this.item = item;
        this.amount = amount;
    }

    public Item getItem() {
        return item;
    }

    public int getAmount() {
        return amount;
    }
}
