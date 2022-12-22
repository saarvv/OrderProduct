package com.sarvin.orderProduct.order;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    Order toEntity(OrderDto orderDto);

    OrderDto toDto(Order order);

    List<OrderDto> toDto(List<Order> orders);

    List<Order> toEntities(List<OrderDto> orderDtos);
}
