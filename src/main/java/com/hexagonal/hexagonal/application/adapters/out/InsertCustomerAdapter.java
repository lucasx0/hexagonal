package com.hexagonal.hexagonal.application.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hexagonal.hexagonal.application.adapters.out.repository.CustomerRepository;
import com.hexagonal.hexagonal.application.adapters.out.repository.mapper.CustomerEntityMapper;
import com.hexagonal.hexagonal.application.core.domain.Customer;
import com.hexagonal.hexagonal.application.core.ports.out.InsertCustomerOutputPort;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;
   
    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity); // Assuming a method to convert Customer to CustomerEntity is implemented
    }

}
