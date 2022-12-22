package com.sarvin.orderProduct.order;


import java.util.List;

public interface IOrderService {

    List<Order> findAll();

    Order save(Order order);


}
