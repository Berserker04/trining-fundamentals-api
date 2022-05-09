package com.training.training.infraestructure.adapters.out;

import com.training.training.products.application.domain.Product;
import com.training.training.products.application.domain.ProductId;
import com.training.training.products.application.ports.out.ProductRepository;
import com.training.training.shared.domain.PageQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MySqlRepository implements ProductRepository {
    @Override
    public Integer store(Product product) {
        return null;
    }

    @Override
    public Product get(ProductId productId) {
        return null;
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public List<Product> getProducts(PageQuery pageQuery) {
        return null;
    }
}
