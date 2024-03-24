package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.service.IBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/banks")
public class BankController {

    @Autowired
    private IBankService bankService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Bank create(@RequestBody Bank bank) {
        return bankService.save(bank);
    }

    @GetMapping
    public List<Bank> getAll() {
        return bankService.getAll();
    }


    @GetMapping("/getCampains")
    public List<Campaign> getCampains() {
        return bankService.getCampains();
    }

    @GetMapping("/recentCampains")
    public List<Campaign> getRecentCampains() {
        return bankService.getRecentCampains();
    }


}
