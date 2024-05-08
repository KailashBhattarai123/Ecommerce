package com.kailash.Demo3.model;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name = "product")
public class Product {

    @Column(name = "product_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;

    private String name;

    private double price;

    private String category;
    private String descripiton;

    private double weight;

    @Column(name = "country_of_origin")
    private String countryOfOrigin;

    private String quality;

    private double min_weight;

    @Column()
    private String imageUrl;

    public Product(int productId, String name, double price, String category, String descripiton, double weight, String countryOfOrigin, String quality, double min_weight, String imageUrl) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
        this.descripiton = descripiton;
        this.weight = weight;
        this.countryOfOrigin = countryOfOrigin;
        this.quality = quality;
        this.min_weight = min_weight;
        this.imageUrl = imageUrl;
    }

    public Product() {
    }

    public Product(String name, double price, String category, String descripiton, double weight, String countryOfOrigin, String quality, double min_weight, String imageUrl) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.descripiton = descripiton;
        this.weight = weight;
        this.countryOfOrigin = countryOfOrigin;
        this.quality = quality;
        this.min_weight = min_weight;
        this.imageUrl = imageUrl;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescripiton() {
        return descripiton;
    }

    public void setDescripiton(String descripiton) {
        this.descripiton = descripiton;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public double getMin_weight() {
        return min_weight;
    }

    public void setMin_weight(double min_weight) {
        this.min_weight = min_weight;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
