package com.sarvin.orderProduct.customer;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-22T15:25:32+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer toEntity(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( customerDto.getId() );
        customer.setFirstName( customerDto.getFirstName() );
        customer.setLastName( customerDto.getLastName() );
        customer.setDescription( customerDto.getDescription() );
        customer.setEmail( customerDto.getEmail() );

        return customer;
    }

    @Override
    public CustomerDto toDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();

        customerDto.setId( customer.getId() );
        customerDto.setFirstName( customer.getFirstName() );
        customerDto.setLastName( customer.getLastName() );
        customerDto.setDescription( customer.getDescription() );
        customerDto.setEmail( customer.getEmail() );

        return customerDto;
    }

    @Override
    public List<CustomerDto> toDto(List<Customer> customers) {
        if ( customers == null ) {
            return null;
        }

        List<CustomerDto> list = new ArrayList<CustomerDto>( customers.size() );
        for ( Customer customer : customers ) {
            list.add( toDto( customer ) );
        }

        return list;
    }

    @Override
    public List<Customer> toEntities(List<CustomerDto> customerDtos) {
        if ( customerDtos == null ) {
            return null;
        }

        List<Customer> list = new ArrayList<Customer>( customerDtos.size() );
        for ( CustomerDto customerDto : customerDtos ) {
            list.add( toEntity( customerDto ) );
        }

        return list;
    }
}
