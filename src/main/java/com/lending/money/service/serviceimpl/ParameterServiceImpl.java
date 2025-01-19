package com.lending.money.service.serviceimpl;

import com.lending.money.entity.Parameter;
import com.lending.money.repository.ParameterRepository;
import com.lending.money.service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParameterServiceImpl implements ParameterService {

    @Autowired
    private ParameterRepository parameterRepository;

    @Override
    public Parameter addParameter(Parameter parameter) {
        return parameterRepository.save(parameter);

    }
}
