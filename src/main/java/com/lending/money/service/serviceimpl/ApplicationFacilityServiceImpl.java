package com.lending.money.service.serviceimpl;

import com.lending.money.entity.ApplicationFacility;
import com.lending.money.repository.ApplicationFacilityRepository;
import com.lending.money.service.ApplicationFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationFacilityServiceImpl implements ApplicationFacilityService {

    @Autowired
    private ApplicationFacilityRepository applicationFacilityRepository;

    @Override
    public ApplicationFacility addApplicationFacility(ApplicationFacility applicationFacility) {
        return applicationFacilityRepository.save(applicationFacility);

    }
}
