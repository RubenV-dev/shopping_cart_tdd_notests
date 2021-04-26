package com.galvanize.cart;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {

    @Test
    public void whenInitializedCartIsEmpty(){
        //Setup
        int expected = 0;
        Cart cart = new Cart();
        //Execute
        int actual = cart.getList().size();
        //Assert
        assertEquals(expected,actual,"cart size should be 0");
    }

    @Test
    public void isEmptyMethodShouldReturnABoolean(){
        //Setup
        boolean expected1 = true;
        boolean expected2 = false;
        Cart cart = new Cart();

        //Execute
        boolean actual1 = cart.isEmpty();
        cart.getList().add(new Item("name", 0.00));
        boolean actual2 = cart.isEmpty();

        //Assert
        assertEquals(expected1, actual1,"should have isEmpty method");
        assertEquals(expected2, actual2,"should be false if the list is empty");

    }

    @Test
    public void shouldReturnTotalPrice() {
        //Setup
        double expected = 0.00;
        double expected2 = 1.00;
        Cart cart = new Cart();
        Cart cart2 = new Cart();
        cart2.addItem(new Item("name", 1.00));
        //Execute
        double actual = cart.getTotalPrice();
        double actual2 = cart2.getTotalPrice();

        //Assert
        assertEquals(expected, actual, "should return total price of $0.00");
        assertEquals(expected2, actual2, "should return total price of $1.00");
    }

    @Test
    public void shouldPrintItemizedListOfItemsInCart() {
        String expected = "Apples: $1.00\nOranges: $1.25\nBread: $4.50\n";
        String expected2 = "No items in cart";
        Cart cart = new Cart();
        cart.addItem(new Item("Apples",  1.00));
        cart.addItem(new Item("Oranges",  1.25));
        cart.addItem(new Item("Bread",  4.50));

        Cart cart2 = new Cart();

        String actual = cart.itemizedList();
        String actual2 = cart2.itemizedList();

        assertEquals(expected,actual,"should reflect the items added along with their price - Apples: $1.00");
        assertEquals(expected2,actual2,"empty cart should reflect no items message");

    }

    @Test
    public void totalPriceShouldReflectQuantityAndItemPrice(){
        double expected = 2.0;
        Cart cart = new Cart();
        cart.addItem(new Item("Apples",  1.00));
        cart.addItem(new Item("Apples",  1.00));

        double actual = cart.getTotalPrice();

        assertEquals(expected,actual,"total price should reflect quantity and item price");
    }

    @Test
    public void itemQuantitiesShouldReflectQuantityAndItemPrice(){
        String expected = "Apples: 2\nOranges: 1\n";
        String expected2 = "No items in cart";

        Cart cart = new Cart();
        cart.addItem(new Item("Apples",  1.00));
        cart.addItem(new Item("Apples",  1.00));
        cart.addItem(new Item("Oranges",  1.10));
        Cart cart2 = new Cart();

        String actual = cart.itemQuantities();
        String actual2 = cart2.itemQuantities();

        assertEquals(expected,actual,"item quantities should reflect correct quantity");
        assertEquals(expected2,actual2,"should return no items message");
    }

    @Test
    public void shouldIncludeOnlyItemsOnSale() {
        ArrayList<String> expected = new ArrayList();
        expected.add("Bread");
//      ArrayList expected2 = new ArrayList<>();
        Cart cart = new Cart();
        cart.addItem(new Item("Apples",  1.00));
        cart.addItem(new Item("Oranges",  1.25));
        cart.addItem(new Item("Bread",  4.50));
        Cart cart2 = new Cart();

        ArrayList<String> actual = cart.onSaleItems();
//      ArrayList<String> actual2 = cart2.onSaleItems();

        assertArrayEquals(expected.toArray(), actual.toArray(), "should show only on sale items");
//        assertEquals(expected2, actual2, "Should show no items on sale");
    }
}
