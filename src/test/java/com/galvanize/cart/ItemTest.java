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
        Item item1 = new Item();
        //Execute
        double actual = item1.getPrice();
        //Assert
        assertEquals(expected,actual,"item price should be 0.0");
    }
}
