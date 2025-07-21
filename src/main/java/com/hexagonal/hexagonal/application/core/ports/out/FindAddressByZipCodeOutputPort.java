package com.hexagonal.hexagonal.application.core.ports.out;

import com.hexagonal.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
 
    Address find(String zipCode);
}
