package com.sarvin.orderProduct.customer;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    @ApiModelProperty(value = "Customer id")
    private Long id;

    @ApiModelProperty(value = "Customer firstName")
    private String firstName;

    @ApiModelProperty(value = "Customer lastName")
    private String lastName;

    @ApiModelProperty(value = "Customer description")
    private String description;

    @ApiModelProperty(value = "Customer email")
    private String email;
}
