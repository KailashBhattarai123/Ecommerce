package com.kailash.Demo3.controllers;

import com.kailash.Demo3.model.CartItem;
import com.kailash.Demo3.model.Product;
import com.kailash.Demo3.model.User;
import com.kailash.Demo3.services.CartItemService;
import com.kailash.Demo3.services.ProductService;
import com.kailash.Demo3.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/users/carts")
public class CartController {

    @Autowired
    private UserService userService;


    @Autowired
    private CartItemService cartItemService;

    @Autowired
    ProductService productService;


    @GetMapping("/")
    public ModelAndView getUserData() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        ModelAndView mv = new ModelAndView("users/cart");
        if (authentication != null && authentication.isAuthenticated()) {
            String username = authentication.getName();
            System.out.println(username);
            User user = userService.getUserByUsername(username);
            List<CartItem> cartItems = cartItemService.getCarts(user);
            mv.addObject("cartItems", cartItems);
        }
        return mv;

    }


    @GetMapping("/add_to_cart/{product_id}")
    public void addCart(@PathVariable("product_id") Long productId) {

        User user = null;

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            String username = authentication.getName();
            user = userService.getUserByUsername(username);
        }

        System.out.println(productId);
        Product product = productService.findById(productId);
        double total = product.getPrice() * 1;

        CartItem cartItem = new CartItem(product, user, 1, total);
        cartItemService.addCart(cartItem);


//        CartItemService
//
//        cartItemService.addCart();

//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//        if (authentication != null & authentication.isAuthenticated()) {
//            String username = authentication.getName();
//            User user = userService.getUserByUsername(username);
//            System.out.println(user.getUserId());
            //cartService.addCart(user.getUserId());

//        }
//
//        else {
//
//        }
    }

//    @GetMapping("/{userId}")
//    public ResponseEntity<List<Cart>> getCartByUserId(@PathVariable Long userId) {
//        List<Cart> carts = cartService.getCartByUserId(userId);
//        return ResponseEntity.ok(carts);
//    }
}
