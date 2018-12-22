package com.sample.mongodb.service;

import com.sample.mongodb.model.Account;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {
     String saveAccount(Account account);
}
