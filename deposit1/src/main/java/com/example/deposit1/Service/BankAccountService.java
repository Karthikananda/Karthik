package com.example.deposit1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.deposit1.pojo.BankAccount;
import com.example.deposit1.repository.BankAccountRepository;


@Service
public class BankAccountService {
	
	@Autowired
	BankAccountRepository bankAccountRepository;

	public BankAccount deposit(String accNo, double amt) {
		BankAccount acc = bankAccountRepository.findByAccNo(accNo);
		System.out.println();
		BankAccount acc1=null;
		if(acc!=null) {
			acc.setBalance(acc.getBalance()+amt);
			acc1 = bankAccountRepository.save(acc);
		}
		return acc1;
	}
	
}      
