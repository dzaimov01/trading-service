package com.investingservice.investingservice.models.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private UUID id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
}
