package com.training.training.typesProduct.application.ports.out;

import com.training.training.products.application.domain.Product;
import com.training.training.shared.domain.PageQuery;
import com.training.training.typesProduct.application.domain.TypeProduct;
import com.training.training.typesProduct.application.domain.TypeProductId;

import java.util.List;

public interface TypeProductRepository {
    Integer store(TypeProduct TypeProduct);
    Product get(TypeProductId typeProductId);
    void update(TypeProduct TypeProduct);
    void delete(TypeProduct TypeProduct);
    List<TypeProduct> getProducts(PageQuery pageQuery);
}
