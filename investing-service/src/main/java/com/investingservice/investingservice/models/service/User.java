package com.investingservice.investingservice.models.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private String username;
    private String email;
    private String password;
}
