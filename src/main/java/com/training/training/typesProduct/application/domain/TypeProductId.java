package com.training.training.typesProduct.application.domain;

import org.apache.commons.lang3.Validate;

public class TypeProductId {
    private final Integer value;

    public TypeProductId(Integer value) {
        Validate.notNull(value, "typeProduct Id can no be null");
        Validate.isTrue(value < 99999999, "typeProduct Id can no be longer than 8 cataracters");
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
