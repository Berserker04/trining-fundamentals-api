package com.training.training.products.application.domain;

import org.apache.commons.lang3.Validate;

public class ProductName {
    private final String value;

    public ProductName(String value) {
        Validate.notNull(value, "product name can no be null");
        Validate.isTrue(value.length() < 40, "product name can no be longer than 40 cataracters");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
