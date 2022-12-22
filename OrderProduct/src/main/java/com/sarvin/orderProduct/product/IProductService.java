package com.sarvin.orderProduct.product;

import java.util.List;

public interface IProductService {

    Product save(Product product);

    List<Product> findAll();

    Product findById(Long Id);

    void delete(Long id);

}
