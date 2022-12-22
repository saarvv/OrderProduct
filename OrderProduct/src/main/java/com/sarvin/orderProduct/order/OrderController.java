package com.sarvin.orderProduct.order;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private IOrderService orderService;
    private OrderRepository orderRepository;
    private OrderMapper orderMapper;

    public OrderController(IOrderService orderService, OrderRepository orderRepository, OrderMapper orderMapper) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
    }

    @PostMapping
    public ResponseEntity<Object> saveOrder(@RequestBody @Valid OrderDto orderDto) {

        Order order = orderMapper.toEntity(orderDto);
        orderService.save(order);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/orders")
    public List<Order> getAll() {
        List<Order> orders = orderService.findAll();
        List<OrderDto> orderDtos = orderMapper.toDto(orders);
        return orderService.findAll();
    }

}
