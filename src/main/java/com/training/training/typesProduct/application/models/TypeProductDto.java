package com.training.training.typesProduct.application.models;

import com.training.training.typesProduct.application.domain.TypeProduct;
import com.training.training.typesProduct.application.domain.TypeProductId;
import com.training.training.typesProduct.application.domain.TypeProductName;

public class TypeProductDto {
    private Integer id;
    private String name;

    public TypeProductDto() {
    }

    public TypeProductDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public TypeProduct toDomain(){
        return new TypeProduct(
                new TypeProductId(id),
                new TypeProductName(name)
        );
    }

    public static TypeProductDto fromDomain(TypeProduct typeProduct){
        return new TypeProductDto(
                typeProduct.getTypeProductId().getValue(),
                typeProduct.getTypeProductName().getValue()
        );
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
