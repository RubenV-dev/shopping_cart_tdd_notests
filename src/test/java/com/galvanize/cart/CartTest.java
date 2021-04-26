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

}
