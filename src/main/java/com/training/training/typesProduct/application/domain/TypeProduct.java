package com.training.training.typesProduct.application.domain;

public class TypeProduct {
    private final TypeProductId productId;
    private final TypeProductName productName;

    public TypeProduct(TypeProductId productId, TypeProductName productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public TypeProductId getTypeProductId() {
        return productId;
    }

    public TypeProductName getTypeProductName() {
        return productName;
    }
}
