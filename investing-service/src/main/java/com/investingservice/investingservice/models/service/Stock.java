package com.investingservice.investingservice.models.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    private String symbol;
    private float currentRatio;
    private float dERatio;
    private float pERatio;
    private float divident;
    private float efficiencyRatio;
}
