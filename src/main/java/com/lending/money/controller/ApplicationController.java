package com.lending.money.controller;

import com.lending.money.entity.Application;
import com.lending.money.service.ApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
@Slf4j
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/createApplication")
    public ResponseEntity<Application> createApplication(@RequestBody Application application){
        Application createApplication= applicationService.createApplication(application);
        return new ResponseEntity<>(createApplication, HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public String get() {
        return "bbb";
    }
}
