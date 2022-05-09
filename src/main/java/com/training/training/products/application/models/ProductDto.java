package com.training.training.products.application.models;

import com.training.training.products.application.domain.*;

public class ProductDto {
    private Integer productId;
    private String name;
    private Integer price;
    private Integer typeOfProduct;
    private Integer discount;

    public ProductDto() {
    }

    public ProductDto(Integer productId, String name, Integer price, Integer typeOfProduct, Integer discount) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.typeOfProduct = typeOfProduct;
        this.discount = discount;
    }

    public Product toDomain(){
        return new Product(
                new ProductId(productId),
                new ProductName(name),
                new ProductPrice(price),
                new TypeOfProduct(typeOfProduct),
                new ProductDiscount(discount)
        );
    }

    public static ProductDto fromDomain(Product product){
        return new ProductDto(
                product.getProductId().getValue(),
                product.getProductName().getValue(),
                product.getProductPrice().getValue(),
                product.getTypeOfProduct().getValue(),
                product.getProductDiscount().getValue()
        );
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(Integer typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
}
