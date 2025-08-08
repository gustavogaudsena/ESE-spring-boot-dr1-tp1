package com.infnet_dr1_tp1.tp1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OperationRequest {
    private double n1;
    private double n2;
    private double base;
    private double exponent;
}
