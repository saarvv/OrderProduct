package com.sarvin.orderProduct.product;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    @ApiModelProperty(value = "Product id")
    private Long id;

    @ApiModelProperty(value = "Product name")
    private String name;

    @ApiModelProperty(value = "Product price")
    private Double price;
}
