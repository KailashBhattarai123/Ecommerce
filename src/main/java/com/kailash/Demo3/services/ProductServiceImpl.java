package com.kailash.Demo3.services;

import com.kailash.Demo3.dao.ProductRepository;
import com.kailash.Demo3.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> productArrayList =  productRepository.findAll();
        return productArrayList;
    }

    @Override
    public List<Product> getVegetableProducts(String category) {

        List<Product> productArrayList = productRepository.findByCategory(category);
        return productArrayList;
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product findById(Long id) {
        Product product = productRepository.findById(id).get();
        return product;
    }

}
