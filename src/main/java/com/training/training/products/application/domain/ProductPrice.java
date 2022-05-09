package com.training.training.products.application.domain;

import org.apache.commons.lang3.Validate;

public class ProductPrice {
    private final Integer value;

    public ProductPrice(Integer value) {
        Validate.notNull(value, "price of product can no be null");
        Validate.isTrue(value < 99999999, "productId can no be longer than 8 cataracters");
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
