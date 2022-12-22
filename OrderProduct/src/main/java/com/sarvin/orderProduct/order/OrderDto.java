package com.sarvin.orderProduct.order;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    @ApiModelProperty(value = "Order id")
    private Long id;

    @ApiModelProperty(value = "Customer id")
    private Long customerId;

    @ApiModelProperty(value = "Product id")
    private Long ProductId;

    @ApiModelProperty(value = "Count")
    private Long count;

}
