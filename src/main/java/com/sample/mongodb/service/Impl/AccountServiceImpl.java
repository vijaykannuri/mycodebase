package com.sample.mongodb.service.Impl;

import com.sample.mongodb.model.Account;
import com.sample.mongodb.repository.AccountRepository;
import com.sample.mongodb.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl  implements AccountService {


    @Autowired
    private AccountRepository accountRepository;

    @Override
    public String saveAccount(Account account) {
        accountRepository.save(account);
        return "success";
    }
}
