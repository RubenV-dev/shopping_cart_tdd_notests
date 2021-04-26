package com.galvanize.cart;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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
        cart.getList().add(new Item(0.00));
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
        cart2.addItem(new Item(1.00));
        //Execute
        double actual = cart.getTotalPrice();
        double actual2 = cart2.getTotalPrice();

        //Assert
        assertEquals(expected, actual, "should return total price of $0.00");
        assertEquals(expected2, actual2, "should return total price of $1.00");
    }
}
