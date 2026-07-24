package com.erp.collegeerp.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private Long id;
    private String fullName;
    private String username;
    private String email;
    private Role role;
    private boolean active;
}