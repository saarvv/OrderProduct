package com.sarvin.orderProduct.product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(Product product) {
        return (Product) productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long Id) {
        return productRepository.findById(Id).get();
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
