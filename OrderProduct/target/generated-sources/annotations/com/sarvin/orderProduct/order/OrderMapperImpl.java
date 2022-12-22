package com.sarvin.orderProduct.order;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-22T15:38:19+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order toEntity(OrderDto orderDto) {
        if ( orderDto == null ) {
            return null;
        }

        Order order = new Order();

        order.setId( orderDto.getId() );
        order.setCount( orderDto.getCount() );

        return order;
    }

    @Override
    public OrderDto toDto(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDto orderDto = new OrderDto();

        orderDto.setId( order.getId() );
        orderDto.setCount( order.getCount() );

        return orderDto;
    }

    @Override
    public List<OrderDto> toDto(List<Order> orders) {
        if ( orders == null ) {
            return null;
        }

        List<OrderDto> list = new ArrayList<OrderDto>( orders.size() );
        for ( Order order : orders ) {
            list.add( toDto( order ) );
        }

        return list;
    }

    @Override
    public List<Order> toEntities(List<OrderDto> orderDtos) {
        if ( orderDtos == null ) {
            return null;
        }

        List<Order> list = new ArrayList<Order>( orderDtos.size() );
        for ( OrderDto orderDto : orderDtos ) {
            list.add( toEntity( orderDto ) );
        }

        return list;
    }
}
