package com.hexagonal.hexagonal.application.adapters.in.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.hexagonal.hexagonal.application.adapters.in.controller.CustomerRequest;

import com.hexagonal.hexagonal.application.core.domain.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer ToCustomer(CustomerRequest customerRequest);
}
