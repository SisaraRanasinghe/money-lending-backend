package com.lending.money.service.serviceimpl;

import com.lending.money.entity.Borrower;
import com.lending.money.repository.BorrowerRepository;
import com.lending.money.response.BorrowerResponse;
import com.lending.money.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowerServiceImpl implements BorrowerService {

    @Autowired
    private BorrowerRepository borrowerRepository;

    @Override
    public BorrowerResponse addBorrower(Borrower borrower) {
        borrowerRepository.save(borrower);
        return new BorrowerResponse();

        //      BorrowerResponse response = new BorrowerResponse();

    }
}
