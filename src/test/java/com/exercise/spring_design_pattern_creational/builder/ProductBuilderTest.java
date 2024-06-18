package com.exercise.spring_design_pattern_creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductBuilderTest {

    @Test
    void testBuilder() {
        Product product = new ProductBuilder()
                .setSku("ELI100")
                .setBrand("INSURANCE")
                .setName("EQUITY LIFESTYLE PROTECTION")
                .setPrice(10D)
                .build();

        assertEquals("ELI100", product.getSku());
        assertEquals("INSURANCE", product.getBrand());
        assertEquals("EQUITY LIFESTYLE PROTECTION", product.getName());
        assertEquals(10D, product.getPrice());

        System.out.println(product);
    }

    @Test
    void testBuilderAnnotation() {
        Product product = Product.builder()
                .sku("ELI100")
                .brand("INSURANCE")
                .name("EQUITY LIFESTYLE INSURANCE")
                .price(10D)
                .build();

        assertEquals("ELI100", product.getSku());
        assertEquals("INSURANCE", product.getBrand());
        assertEquals("EQUITY LIFESTYLE PROTECTION", product.getName());
        assertEquals(10D, product.getPrice());

        System.out.println(product);
    }
}
