package com.lending.money.controller;

import com.lending.money.entity.Parameter;
import com.lending.money.service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class ParameterController {

    @Autowired
    private ParameterService parameterService;

    @PostMapping("/createParameter")
    public ResponseEntity<Parameter> addParameter(@RequestBody Parameter parameter) {

        Parameter addParameter = parameterService.addParameter(parameter);
        return new ResponseEntity<>(addParameter, HttpStatus.CREATED);
    }
}
