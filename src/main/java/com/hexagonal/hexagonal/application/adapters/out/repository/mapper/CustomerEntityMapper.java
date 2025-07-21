package com.hexagonal.hexagonal.application.adapters.out.repository.mapper;

import org.mapstruct.Mapper;

import com.hexagonal.hexagonal.application.adapters.out.repository.entity.CustomerEntity;
import com.hexagonal.hexagonal.application.core.domain.Customer;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
  
    CustomerEntity toCustomerEntity(Customer customer);
}
