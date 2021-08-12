package com.erykandbogdan.eventapp.web.controller.register;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegisterRequest {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
    private final String phoneNumber;
}
