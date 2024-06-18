package com.exercise.spring_design_pattern_creational.builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private final String sku;
    private final String brand;
    private final String name;
    private final Double price;

    public Product(String sku, String brand, String name, Double price) {
        this.sku = sku;
        this.brand = brand;
        this.name = name;
        this.price = price;
    }
}
