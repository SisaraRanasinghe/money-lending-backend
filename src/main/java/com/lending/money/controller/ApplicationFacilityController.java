package com.lending.money.controller;

import com.lending.money.entity.ApplicationFacility;
import com.lending.money.service.ApplicationFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class ApplicationFacilityController {

    @Autowired
    private ApplicationFacilityService applicationFacilityService;

    @PostMapping("/createApplicationFacility")
    public ResponseEntity<ApplicationFacility> addApplicationFacility(@RequestBody ApplicationFacility applicationFacility) {

        ApplicationFacility addApplicationFacility = applicationFacilityService.addApplicationFacility(applicationFacility);
        return new ResponseEntity<>(addApplicationFacility, HttpStatus.CREATED);
    }
}
