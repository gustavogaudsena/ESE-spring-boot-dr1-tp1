package com.infnet_dr1_tp1.tp1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MathResult {
    private OperationType operation;
    private double firstNumber;
    private double secondNumber;
    private double result;
}
