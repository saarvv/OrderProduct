package com.sarvin.orderProduct.order;

import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class OrderService implements IOrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }


}
