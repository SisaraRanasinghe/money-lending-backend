package com.lending.money.service.serviceimpl;

import com.lending.money.entity.Account;
import com.lending.money.repository.AccountRepository;
import com.lending.money.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account addAccount(Account account) {
        return accountRepository.save(account);

    }
}
