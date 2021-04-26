package com.galvanize.cart;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

//As a shopper
//        I want to have a shopping cart
//        So that I can store items until I am ready to checkout
public class Cart {
    private ArrayList<Item> list = new ArrayList<Item>();
    private double totalPrice = 0;
    private HashMap<String, Integer> quantities = new HashMap<String, Integer>();

    public ArrayList<Item> getList() {
        return list;
    }

    public void addItem(Item item){
        this.totalPrice += item.getPrice();
        int q = quantities.getOrDefault(item.getName(), 0) + 1;
        this.quantities.put(item.getName(), q);
        list.add(item);
    }

    public boolean isEmpty() {
        return this.list.size() == 0;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public String itemizedList() {
        if(isEmpty()) return "No items in cart";
        String itemString = "";
        for(Item item : this.list){
            String str = String.format("%s: $%.2f%n",item.getName(),item.getPrice());
            itemString = itemString + str;
        }
        return itemString;
    }

    public String itemQuantities() {
        if(isEmpty()) return "No items in cart";

        String qtyString = "";
        for(String name : quantities.keySet()) {
            String q = String.format("%s: %d%n", name, quantities.get(name));
            qtyString += q;
        }
        return qtyString;
    }

    public ArrayList<String> onSaleItems() {
        return new ArrayList<String>();
    }
}
