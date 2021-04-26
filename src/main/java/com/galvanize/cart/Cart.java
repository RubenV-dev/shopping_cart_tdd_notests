package com.galvanize.cart;

import java.lang.reflect.Array;
import java.util.ArrayList;

//As a shopper
//        I want to have a shopping cart
//        So that I can store items until I am ready to checkout
public class Cart {
    private ArrayList<Item> list = new ArrayList<Item>();
    private double totalPrice = 0;

    public ArrayList<Item> getList() {
        return list;
    }

    public void addItem(Item item){
        this.totalPrice += item.getPrice();
        list.add(item);
    }

    public boolean isEmpty() {
        return this.list.size() == 0;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public String itemizedList() {
        return "";
    }

}
