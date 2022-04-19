package com.company.bank_factory;

import com.company.Bank;
import com.company.bank_type.BankType;
import com.company.banks.TPBank;
import com.company.banks.VietComBank;
import com.company.banks.VietTinBank;

public class BankFactory {
    public BankFactory(){}
    public static final Bank getBankType(BankType bankType){
        switch (bankType){
            case TPBANK:
                return new TPBank();
            case VIETCOMBANK:
                return new VietComBank();
            case VIETINBANK:
                return new VietTinBank();
            default:
                throw new IllegalArgumentException("This bank type is supported");
        }
    }
}
