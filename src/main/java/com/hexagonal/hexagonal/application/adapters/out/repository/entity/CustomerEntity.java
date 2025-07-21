package com.hexagonal.hexagonal.application.adapters.out.repository.entity;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "customer")
public class CustomerEntity {

    @Id
    private String id;
    private String name;
    private AdressEntity address;
    private String cpf;
    private Boolean isValidCpf;
}
