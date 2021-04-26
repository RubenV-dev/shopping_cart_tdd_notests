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
        Item item1 = new Item("name", 0.99);
        Item item2 = new Item("name", 1.10);
        //Execute
        double actual = item1.getPrice();
        double actual2 = item2.getPrice();
        //Assert
        assertEquals(expected,actual,"item price should be 0.99");
        assertEquals(expected2,actual2,"item price should be 1.10");
    }

    @Test
    public void itemShouldHaveName(){
        //Setup
        String expected = "Apples";
        String expected2 = "Bananas";
        Item item1 = new Item("Apples", 0.99);
        Item item2 = new Item("Bananas", 1.10);
        //Execute
        String actual = item1.getName();
        String actual2 = item2.getName();
        //Assert
        assertEquals(expected,actual,"item name should be Apples");
        assertEquals(expected2,actual2,"item name should be Banana");
    }
}
