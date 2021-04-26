package com.galvanize.cart;

public class Item {
    private double price;
    private String name;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }
}
