package com.sample.mongodb.Controller;


import com.sample.mongodb.model.Account;
import com.sample.mongodb.model.Inventory;
import com.sample.mongodb.service.AccountService;
import com.sample.mongodb.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/")
@RestController
public class AccountController {


    @Autowired
    private AccountService accountService;

    @ResponseBody
    @PostMapping(value = "/account")
    public String saveAccount(@Valid @RequestBody Account account){
        return accountService.saveAccount(account);
    }


}
