package com.sarvin.orderProduct.customer;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer toEntity(CustomerDto customerDto);

    CustomerDto toDto(Customer customer);

    List<CustomerDto> toDto(List<Customer> customers);

    List<Customer> toEntities(List<CustomerDto> customerDtos);
}
