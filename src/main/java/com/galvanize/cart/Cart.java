package com.galvanize.cart;

import java.util.ArrayList;

//As a shopper
//        I want to have a shopping cart
//        So that I can store items until I am ready to checkout
public class Cart {
    private ArrayList<Item> list = new ArrayList<Item>();

    public ArrayList<Item> getList() {
        return list;
    }

    public boolean isEmpty() {
        return this.list.size() == 0;
    }

    public double getTotalPrice() {
        return 0.00;
    }

}
