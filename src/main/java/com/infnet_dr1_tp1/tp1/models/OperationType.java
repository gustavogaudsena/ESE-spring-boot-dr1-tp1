package com.infnet_dr1_tp1.tp1.models;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum OperationType {
    ADDITION("Adição"),
    SUBTRACTION("Subtração"),
    MULTIPLICATION("Multiplicação"),
    DIVISION("Divisão"),
    EXPONENTIATION("Exponenciação");
    private final String displayName;

    OperationType(String displayName) {
        this.displayName = displayName;
    }

    @JsonValue
    public String getDisplayName() {
        return displayName;
    }
}
