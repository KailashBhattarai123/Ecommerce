package com.kailash.Demo3.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Orders {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;

    @OneToMany
    @JoinColumn(name = "cart_items")
    private List<CartItem> cartItems;

    public Orders(){}

    public Orders(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}
