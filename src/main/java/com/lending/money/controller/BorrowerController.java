package com.lending.money.controller;

import com.lending.money.entity.Borrower;
import com.lending.money.response.BorrowerResponse;
import com.lending.money.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class BorrowerController {

    @Autowired
    private BorrowerService borrowerService;

    @PostMapping("/add")
    public ResponseEntity<BorrowerResponse> addBorrower(@RequestBody Borrower borrower) {
        BorrowerResponse addBorrower = borrowerService.addBorrower(borrower);
        return new ResponseEntity<>(addBorrower, HttpStatus.CREATED);
    }
}
