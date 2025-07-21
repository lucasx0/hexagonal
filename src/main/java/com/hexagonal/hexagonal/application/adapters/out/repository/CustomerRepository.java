package com.hexagonal.hexagonal.application.adapters.out.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hexagonal.hexagonal.application.adapters.out.repository.entity.AdressEntity;
import com.hexagonal.hexagonal.application.adapters.out.repository.entity.CustomerEntity;

public interface CustomerRepository  extends MongoRepository<CustomerEntity, String> {

    CustomerEntity findByCpf(String cpf);

    CustomerEntity findByName(String name);

    CustomerEntity findByAddress(AdressEntity address);
    
    // Add other query methods as needed

}
