package com.lending.money.controller;

import com.lending.money.entity.Facility;
import com.lending.money.service.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class FacilityController {

    @Autowired
    private FacilityService facilityService;

    @PostMapping("/createFacility")
    public ResponseEntity<Facility> addFacility(@RequestBody Facility facility) {

        Facility addFacility = facilityService.addFacility(facility);
        return new ResponseEntity<>(addFacility, HttpStatus.CREATED);
    }

}
