package com.lending.money.service.serviceimpl;

import com.lending.money.entity.Application;
import com.lending.money.repository.ApplicationRepository;
import com.lending.money.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;


    @Override
    public Application createApplication(Application application) {
        return applicationRepository.save(application);

    }
}
