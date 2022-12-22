package com.sarvin.orderProduct.customer;

import java.util.List;

public interface ICustomerService {

    List<Customer> findAll();

    Customer save(Customer customer);

    Customer findById(Long Id);

    void delete(Long id);

}
