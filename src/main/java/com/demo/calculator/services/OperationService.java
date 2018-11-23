package com.demo.calculator.services;

import com.demo.calculator.api.model.CalculatorForm;
import com.demo.calculator.api.service.OperationInterface;
import com.demo.calculator.enums.OperationEnum;
import org.springframework.stereotype.Service;

@Service
public class OperationService implements OperationInterface {

    private String operation;

    private Long add(Long a, Long b, boolean add) {
        return add ? (a + b) : (a - b);
    }

    @Override
    public Long calculate(CalculatorForm calculatorForm) {
        if(OperationEnum.add.getOperationCode() == calculatorForm.getOperation()){
            return add(calculatorForm.getA(), calculatorForm.getB(), true);
        }
        return 0L;
    }

}