package com.example.deposit1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.deposit1.Service.BankAccountService;
import com.example.deposit1.pojo.BankAccount;



@RestController
public class BankAccountController {
	
	@Autowired
	BankAccountService bankAccountService;
	
	@PostMapping(value="/deposit/")
	public BankAccount deposit(@RequestParam("accNo") String accNo, @RequestParam("amount") double amt) {
	//public BankAccount deposit(@PathVariable("accNo") String accNo, @PathVariable("amount") double amt) {
		return bankAccountService.deposit(accNo,amt);
	}

}