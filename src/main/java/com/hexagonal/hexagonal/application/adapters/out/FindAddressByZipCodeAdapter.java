package com.hexagonal.hexagonal.application.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hexagonal.hexagonal.application.adapters.out.client.FindAddressByZipCodeClient;
import com.hexagonal.hexagonal.application.adapters.out.client.mapper.AddressResponseMapper;
import com.hexagonal.hexagonal.application.core.domain.Address;
import com.hexagonal.hexagonal.application.core.ports.out.FindAddressByZipCodeOutputPort;


@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
       var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }



}
