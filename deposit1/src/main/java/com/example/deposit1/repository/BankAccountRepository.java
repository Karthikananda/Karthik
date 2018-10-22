package com.example.deposit1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.deposit1.pojo.BankAccount;
@Repository
public interface BankAccountRepository extends MongoRepository<BankAccount, String> {
	public BankAccount findByAccNo(String accNo);
}