package com.erp.collegeerp.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    private String fullName;
    private String username;
    private String email;
    private String password;
    private Role role;
}