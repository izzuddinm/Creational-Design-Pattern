package com.exercise.spring_design_pattern_creational.builder;

public class ProductBuilder {
    private String sku;
    private String brand;
    private String name;
    private Double price;

    public ProductBuilder setSku(String sku) {
        this.sku = sku;
        return this;
    }

    public ProductBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setPrice(Double price) {
        this.price = price;
        return this;
    }

    public Product build() {
        return new Product(sku, brand, name, price);
    }
}
