package com.sarvin.orderProduct.order;

import org.springframework.data.repository.PagingAndSortingRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {

    List<Order> findAll();

}
