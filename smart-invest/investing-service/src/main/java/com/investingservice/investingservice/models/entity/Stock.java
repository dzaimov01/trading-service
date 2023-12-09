package com.investingservice.investingservice.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "stocks")
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String symbol;

    //Current ratio should be above 1
    @Column(name = "current_ratio", nullable = false)
    private float currentRatio;

    //D/E ratio should be under 1
    @Column(name = "d_e_ratio", nullable = false)
    private float dERatio;

    @Column(name = "p_e_ratio", nullable = false)
    private float pERatio;

    @Column(name = "divident", nullable = false)
    private float divident;

    @Column(name = "efficiency_ratio", nullable = false)
    private float efficiencyRatio;
}
