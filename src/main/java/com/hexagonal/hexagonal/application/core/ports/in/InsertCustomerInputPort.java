package com.hexagonal.hexagonal.application.core.ports.in;

import com.hexagonal.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
