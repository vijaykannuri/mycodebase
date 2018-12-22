package com.sample.mongodb.repository;

import com.sample.mongodb.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account,String> {
}
