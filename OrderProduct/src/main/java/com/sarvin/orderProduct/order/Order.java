package com.sarvin.orderProduct.order;

import com.sarvin.orderProduct.customer.Customer;
import com.sarvin.orderProduct.product.Product;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    Customer customerId;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    Product productId;

    private Long count;
}
