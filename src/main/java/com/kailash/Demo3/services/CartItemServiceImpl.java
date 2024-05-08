package com.kailash.Demo3.services;

import com.kailash.Demo3.dao.CartItemRepo;
import com.kailash.Demo3.model.CartItem;
import com.kailash.Demo3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemServiceImpl implements CartItemService{
    @Autowired
    CartItemRepo cartItemRepo;

    @Override
    public void addCart(CartItem cartItem) {
        cartItemRepo.save(cartItem);
    }

    @Override
    public void deleteCart(Long cartItemId) {
        cartItemRepo.deleteById(cartItemId);
    }

    @Override
    public List<CartItem> getCarts(User user) {
        List<CartItem> cartItems = cartItemRepo.findByUser(user);
        return cartItems;
    }


}
