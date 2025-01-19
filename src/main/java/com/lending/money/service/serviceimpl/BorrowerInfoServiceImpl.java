package com.lending.money.service.serviceimpl;

import com.lending.money.entity.BorrowerInfo;
import com.lending.money.repository.BorrowerInfoRepository;
import com.lending.money.service.BorrowerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowerInfoServiceImpl implements BorrowerInfoService {

    @Autowired
    private BorrowerInfoRepository borrowerInfoRepository;

    @Override
    public BorrowerInfo addBorrowerInfo(BorrowerInfo borrowerInfo) {
        return borrowerInfoRepository.save(borrowerInfo);
    }
}
