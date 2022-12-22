package com.sarvin.orderProduct.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private ICustomerService customerService;
    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    @Autowired
    public CustomerController(ICustomerService customerService, CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerService = customerService;
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @PostMapping
    public ResponseEntity<Object> saveCustomer(@RequestBody @Valid CustomerDto customerDto) {

        Customer customer = customerMapper.toEntity(customerDto);
        customerService.save(customer);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping("/customerId")
    public Customer save(@RequestBody @Valid CustomerDto customerDto) {
        Customer customer = customerMapper.toEntity(customerDto);
        customerService.save(customer);
        return customerService.save(customer);
    }

    @GetMapping("/customers")
    public List<Customer> getAll() {
        List<Customer> customers = customerService.findAll();
        List<CustomerDto> customerDtos = customerMapper.toDto(customers);
        return customerService.findAll();
    }

    @GetMapping(value = "getById/{id}")
    public ResponseEntity<Customer> getById(@PathVariable Long id) {

        return new ResponseEntity<>(customerService.findById(id), HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        customerService.delete(id);
    }
}
