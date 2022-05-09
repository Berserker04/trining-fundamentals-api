package com.training.training.products.application.ports.out;

import com.training.training.products.application.domain.Product;
import com.training.training.products.application.domain.ProductId;
import com.training.training.shared.domain.PageQuery;

import java.util.List;

public interface ProductRepository {
    Integer store(Product product);
    Product get(ProductId productId);
    void update(Product product);
    void delete(Product product);
    List<Product> getProducts(PageQuery pageQuery);
}
