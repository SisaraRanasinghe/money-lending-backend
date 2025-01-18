package com.lending.money.service;

import com.lending.money.entity.Borrower;
import com.lending.money.response.BorrowerResponse;

public interface BorrowerService {
    BorrowerResponse addBorrower(Borrower borrower);
}
