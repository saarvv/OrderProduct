package com.sarvin.orderProduct.product;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product toEntity(ProductDto productDto);

    ProductDto toDto(Product product);

    List<ProductDto> toDto(List<Product> products);

    List<Product> toEntities(List<ProductDto> productDtos);
}
