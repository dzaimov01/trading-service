package com.investingservice.investingservice.models.rest;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    @NotEmpty(message = "Username cannot be empty!")
    private String username;

    @NotEmpty(message = "Email cannot be empty!")
    private String email;

    @NotEmpty(message = "Password cannot be empty!")
    private String password;
}
