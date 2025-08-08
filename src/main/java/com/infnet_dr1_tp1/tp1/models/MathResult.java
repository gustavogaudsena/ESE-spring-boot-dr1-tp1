package com.infnet_dr1_tp1.tp1.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MathResult {
    private OperationType operation;
    @JsonProperty("n1")
    private double firstNumber;
    @JsonProperty("n2")
    private double secondNumber;
    private double result;
}
