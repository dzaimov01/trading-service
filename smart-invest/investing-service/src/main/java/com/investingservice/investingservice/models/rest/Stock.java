package com.investingservice.investingservice.models.rest;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Stock {
    @NotEmpty(message = "Stock Symbol cannot be empty!")
    private String stockSymbol;
}
