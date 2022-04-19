package com.company;

import com.company.bank_factory.BankFactory;
import com.company.bank_type.BankType;

public class Main {

    public static void main(String[] args) {
	// write your code here
Bank bank = BankFactory.getBankType(BankType.VIETINBANK);
        System.out.println(bank.getBankName());
    }
}
