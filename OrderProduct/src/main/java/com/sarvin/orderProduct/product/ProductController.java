package com.sarvin.orderProduct.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(name = "/product")
public class ProductController {

    private IProductService productService;
    private ProductRepository productRepository;
    private ProductMapper productMapper;

    @Autowired
    public ProductController(IProductService productService, ProductRepository productRepository, ProductMapper productMapper) {
        this.productService = productService;
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @PostMapping("/product")
    public ResponseEntity<Object> saveProduct(@RequestBody @Valid ProductDto productDto) {
        Product product = productMapper.toEntity(productDto);
        productService.save(product);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping("/productId")
    public Product save(@RequestBody @Valid ProductDto productDto) {
        Product product = productMapper.toEntity(productDto);
        productService.save(product);
        return productService.save(product);
    }

    @GetMapping("/products")
    public List<Product> getAll() {
        List<Product> products = productService.findAll();
        List<ProductDto> productDtos = productMapper.toDto(products);
        return productService.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> getById(@PathVariable Long id) {

        return new ResponseEntity<>(productService.findById(id), HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }
}
