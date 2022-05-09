package com.training.training.products.application.domain;

import org.apache.commons.lang3.Validate;

public class ProductDiscount {
    private final Integer value;

    public ProductDiscount(Integer value) {
        Validate.notNull(value, "discount of product can no be null");
        Integer start = 0, end = 100;
        Validate.inclusiveBetween(start, end, value);
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
