package com.training.training.typesProduct.application.domain;

import org.apache.commons.lang3.Validate;

public class TypeProductName {
    private final String value;

    public TypeProductName(String value) {
        Validate.notNull(value, "typeProduct name can no be null");
        Validate.isTrue(value.length() < 40, "typeProduct name can no be longer than 40 cataracters");
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
