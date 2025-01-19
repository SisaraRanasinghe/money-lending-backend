package com.lending.money.service.serviceimpl;

import com.lending.money.entity.Facility;
import com.lending.money.repository.FacilityRepository;
import com.lending.money.service.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacilityServiceImpl implements FacilityService {

    @Autowired
    private FacilityRepository facilityRepository;

    @Override
    public Facility addFacility(Facility facility) {
        return facilityRepository.save(facility);
    }
}
