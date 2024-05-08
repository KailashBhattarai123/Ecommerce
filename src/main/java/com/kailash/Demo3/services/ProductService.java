package com.kailash.Demo3.services;

import com.kailash.Demo3.model.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public interface ProductService {

    public void save(Product product);
    public List<Product> getAllProducts();


    List<Product> getVegetableProducts(String category);

    public void delete(Long id);

    public Product findById(Long id);
}
