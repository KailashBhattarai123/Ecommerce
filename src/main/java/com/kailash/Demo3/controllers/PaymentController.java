package com.kailash.Demo3.controllers;

import com.kailash.Demo3.model.CartItem;
import com.kailash.Demo3.model.Orders;
import com.kailash.Demo3.model.PaymentModel;
import com.kailash.Demo3.model.User;
import com.kailash.Demo3.services.CartItemService;
import com.kailash.Demo3.services.OrderService;
import com.kailash.Demo3.services.PaymentSevice;
import com.kailash.Demo3.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.UUID;

@Controller
public class PaymentController {

    @Autowired
    PaymentSevice paymentSevice;

    @Autowired
    OrderService orderService;

    @Autowired
    CartItemService cartItemService;

    @Autowired
    UserService userService;

    @GetMapping("/users/payments/esewa")
    public ModelAndView esewaPayment(ModelAndView mv) {
        User user = userService.getUserByUsername("Ramesh");

        List<CartItem> cartItems = cartItemService.getCarts(user);
        System.out.println(cartItems.get(0).getTotalProduct());
        Orders orders = new Orders();
        orders.setCartItems(cartItems);
        orderService.addOrder(orders);

        PaymentModel pm = new PaymentModel();
        pm.setAmount(100.0);
        pm.setTaxAmount(13.0);
        pm.setTotalAmount(113.0);
        pm.setPdc(0);
        pm.setPsc(0);
        pm.setTransactionUUID("DEMO3-081-01-"+UUID.randomUUID());
        pm.setProductCode("EPAYTEST");
        String message = "total_amount="+pm.getTotalAmount()+",transaction_uuid="+pm.getTransactionUUID()+",product_code="+pm.getProductCode();
        pm.setSignature(paymentSevice.getSignature(message));
        mv.addObject("pm",pm);
        mv.setViewName("users/esewa_payment");
        return mv;
    }
}
