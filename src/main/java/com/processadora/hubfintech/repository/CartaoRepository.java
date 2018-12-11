package com.processadora.hubfintech.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.processadora.hubfintech.model.Cartao;

public interface CartaoRepository extends MongoRepository<Cartao, String> {

    public Cartao findByCardNumber(String cardNumber);
}
