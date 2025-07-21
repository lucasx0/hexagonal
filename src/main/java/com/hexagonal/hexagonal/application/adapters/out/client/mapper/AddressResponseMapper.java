package com.hexagonal.hexagonal.application.adapters.out.client.mapper;

import org.mapstruct.Mapper;

import com.hexagonal.hexagonal.application.adapters.out.client.response.AddressResponse;
import com.hexagonal.hexagonal.application.core.domain.Address;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

  Address toAddress(AddressResponse addressResponse);
  
}
