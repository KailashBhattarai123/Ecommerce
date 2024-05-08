package com.kailash.Demo3.services;

import com.kailash.Demo3.model.CartItem;
import com.kailash.Demo3.model.User;

import java.util.List;

public interface CartItemService {
    void addCart(CartItem cartItem);

    void deleteCart(Long cartItemId);

    List<CartItem> getCarts(User user);

}
