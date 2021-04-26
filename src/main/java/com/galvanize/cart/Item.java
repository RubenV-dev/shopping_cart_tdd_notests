package com.galvanize.cart;

public class Item {
    private double price;
    private String name;
    private boolean onSale = false;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, double price, boolean onSale){
        this.name = name;
        this.price = price;
        this.onSale = onSale;
    }

    public double getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }

    public boolean getOnSale(){
        return this.onSale;
    }
}
