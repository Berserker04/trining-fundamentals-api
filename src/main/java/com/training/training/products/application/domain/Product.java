package com.training.training.products.application.domain;

public class Product {
    private final ProductId productId;
    private final ProductName productName;
    private final ProductPrice productPrice;
    private final TypeOfProduct typeOfProduct;
    private final ProductDiscount productDiscount;

    public Product(ProductId productId, ProductName productName, ProductPrice productPrice, TypeOfProduct typeOfProduct, ProductDiscount productDiscount) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.typeOfProduct = typeOfProduct;
        this.productDiscount = productDiscount;
    }

    public ProductId getProductId() {
        return productId;
    }

    public ProductName getProductName() {
        return productName;
    }

    public ProductPrice getProductPrice() {
        return productPrice;
    }

    public TypeOfProduct getTypeOfProduct() {
        return typeOfProduct;
    }

    public ProductDiscount getProductDiscount() {
        return productDiscount;
    }
}
