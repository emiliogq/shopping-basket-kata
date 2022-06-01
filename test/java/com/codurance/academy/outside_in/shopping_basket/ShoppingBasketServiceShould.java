package com.codurance.academy.outside_in.shopping_basket;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ShoppingBasketServiceShould {
    @Test
    void addItemsToShoppingBasket(){

        ShoppingBasketService shoppingBasketService = new ShoppingBasketService();
        ShoppingBasket shoppingBasket = mock(ShoppingBasket.class);
        Product hobbit = mock(Product.class);
        Product breakingBad = mock(Product.class);

        User user = mock(User.class);

        when(hobbit.getId()).thenReturn(10002);
        when(hobbit.getName()).thenReturn("The Hobbit");

        when(breakingBad.getId()).thenReturn(20110);
        when(breakingBad.getName()).thenReturn("Breaking Bad");

        shoppingBasketService.addItem(1, 10002, 2);
        shoppingBasketService.addItem(1, 20110, 5);


        verify(shoppingBasket).add(hobbit, 2);
        verify(shoppingBasket).add(breakingBad, 5);

    }






}
