package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.model.Campaign;

import java.util.ArrayList;
import java.util.List;

public class BankRepository {
    private List<Bank> bankList = new ArrayList<>();

    public void save(Bank bank) {
        bankList.add(bank);
    }

    public List<Bank> getAll() {
        return bankList;
    }

    public void delete(Bank bank) {
        bankList.remove(bank);
    }

}
