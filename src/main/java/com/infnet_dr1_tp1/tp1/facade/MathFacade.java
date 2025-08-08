package com.infnet_dr1_tp1.tp1.facade;

import com.infnet_dr1_tp1.tp1.models.MathResult;
import com.infnet_dr1_tp1.tp1.models.OperationType;
import org.springframework.stereotype.Service;

@Service
public class MathFacade {

    public MathResult add(double n1, double n2) {
        double result = n1 + n2;
        return new MathResult(OperationType.ADDITION, n1, n2, result);
    }

    public MathResult subtract(double n1, double n2) {
        double result = n1 - n2;
        return new MathResult(OperationType.SUBTRACTION, n1, n2, result);
    }

    public MathResult multiply(double n1, double n2) {
        double result = n1 * n2;
        return new MathResult(OperationType.MULTIPLICATION, n1, n2, result);
    }

    public MathResult divide(double n1, double n2) {
        double result = n1 / n2;
        return new MathResult(OperationType.DIVISION, n1, n2, result);
    }

    public MathResult exponentiate(double base, double exponent) {
        double result = Math.pow(base, exponent);
        return new MathResult(OperationType.EXPONENTIATION, base, exponent, result);
    }
}
