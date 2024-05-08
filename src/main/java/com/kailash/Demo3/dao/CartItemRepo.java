package com.kailash.Demo3.dao;

import com.kailash.Demo3.model.CartItem;
import com.kailash.Demo3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CartItemRepo extends JpaRepository<CartItem, Long> {
    List<CartItem> findByUser(User user);
}
