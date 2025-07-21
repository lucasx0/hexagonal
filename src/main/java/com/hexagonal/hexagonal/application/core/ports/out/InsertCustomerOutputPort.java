package com.hexagonal.hexagonal.application.core.ports.out;

import com.hexagonal.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
