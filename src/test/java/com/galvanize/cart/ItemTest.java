package com.galvanize.cart;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {
    @Test
    public void itemShouldHavePrice(){
        //Setup
        double expected = 0.99;
        double expected2 = 1.10;
        Item item1 = new Item(0.99);
        Item item2 = new Item(1.10);
        //Execute
        double actual = item1.getPrice();
        double actual2 = item2.getPrice();
        //Assert
        assertEquals(expected,actual,"item price should be 0.99");        assertEquals(expected,actual,"item price should be 0.0");
        assertEquals(expected2,actual2,"item price should be 1.10");
    }
}
