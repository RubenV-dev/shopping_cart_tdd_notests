package com.galvanize.cart;

public class Item {
    private double price;
    private String name;

    public Item(double price) {
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public String getName(){
        return name;
    }
}
