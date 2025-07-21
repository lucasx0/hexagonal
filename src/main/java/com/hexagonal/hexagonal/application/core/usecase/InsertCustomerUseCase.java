package com.hexagonal.hexagonal.application.core.usecase;

import com.hexagonal.hexagonal.application.core.domain.Customer;
import com.hexagonal.hexagonal.application.core.ports.in.InsertCustomerInputPort;
import com.hexagonal.hexagonal.application.core.ports.out.FindAddressByZipCodeOutputPort;
import com.hexagonal.hexagonal.application.core.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(
        FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
        InsertCustomerOutputPort insertCustomerOutputPort
    ) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }
 
    @Override
    public void insert(Customer customer, String zipCode) {
       var adress = findAddressByZipCodeOutputPort.find(zipCode);
       customer.setAddress(adress);
       insertCustomerOutputPort.insert(customer);
    }
}
