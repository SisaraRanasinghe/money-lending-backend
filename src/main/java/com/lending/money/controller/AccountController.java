package com.lending.money.controller;

import com.lending.money.entity.Account;
import com.lending.money.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/createAccount")
    public ResponseEntity<Account> addAccount(@RequestBody Account account) {

        Account addAccount = accountService.addAccount(account);
        return new ResponseEntity<>(addAccount, HttpStatus.CREATED);
    }
}
