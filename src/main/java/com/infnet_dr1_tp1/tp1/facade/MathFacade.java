package com.infnet_dr1_tp1.tp1.facade;

import com.infnet_dr1_tp1.tp1.models.MathResult;
import com.infnet_dr1_tp1.tp1.models.OperationType;
import org.springframework.stereotype.Service;

@Service
public class MathFacade {

    public MathResult add(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        return new MathResult(OperationType.ADDITION, firstNumber, secondNumber, result);
    }

    public MathResult subtract(double firstNumber, double secondNumber) {
        double result = firstNumber - secondNumber;
        return new MathResult(OperationType.SUBTRACTION, firstNumber, secondNumber, result);
    }

    public MathResult multiply(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        return new MathResult(OperationType.MULTIPLICATION, firstNumber, secondNumber, result);
    }

    public MathResult divide(double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        return new MathResult(OperationType.DIVISION, firstNumber, secondNumber, result);
    }

    public MathResult exponentiate(double base, double exponent) {
        double result = Math.pow(base, exponent);
        return new MathResult(OperationType.EXPONENTIATION, base, exponent, result);
    }
}
