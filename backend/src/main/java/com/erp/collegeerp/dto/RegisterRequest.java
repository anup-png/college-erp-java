package com.erp.collegeerp.dto;

import com.erp.collegeerp.model.Role;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    private String username;
    private String email;
    private String password;
    private Role role;
}