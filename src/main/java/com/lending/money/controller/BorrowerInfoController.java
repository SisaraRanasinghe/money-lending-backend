package com.lending.money.controller;

import com.lending.money.entity.BorrowerInfo;
import com.lending.money.service.BorrowerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class BorrowerInfoController {

    @Autowired
    private BorrowerInfoService borrowerInfoService;

    @PostMapping("/createBorrowerInfo")
    public ResponseEntity<BorrowerInfo> addBorrowerInfo(@RequestBody BorrowerInfo borrowerInfo) {

        BorrowerInfo addBorrowerInfo = borrowerInfoService.addBorrowerInfo(borrowerInfo);
        return new ResponseEntity<>(addBorrowerInfo, HttpStatus.CREATED);
    }
}
