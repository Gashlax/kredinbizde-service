package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.model.CreditCard;
import com.patika.kredinbizdeservice.repository.BankRepository;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BankService implements IBankService{

    private BankRepository bankRepository = new BankRepository();

    @Override
    public Bank save(Bank bank) {
        return null;
    }

    @Override
    public List<Bank> getAll() {
        return null;
    }

    @Override
    public List<Campaign> getCampains() {
        List<Bank> allBanks=bankRepository.getAll();
        List<Campaign> campaignList = null;
        allBanks.forEach(bank -> {
            bank.getCreditCards().forEach(creditCart ->{
                creditCart.getCampaignList().forEach(campaignList::add);
            });
        });
        return campaignList;
    }

    @Override
    public List<Campaign> getRecentCampains(){
        return getCampains()
                .stream()
                .sorted((c1, c2) -> c1.getDueDate().compareTo(c2.getDueDate()))
                .collect(Collectors.toList());
    }
}
