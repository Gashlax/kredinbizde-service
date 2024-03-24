package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.model.Campaign;

import java.util.List;

public interface IBankService {

    Bank save(Bank bank);

    List<Bank> getAll();

    List<Campaign> getCampains();

    List<Campaign> getRecentCampains();
}
