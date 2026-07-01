package com.erp.collegeerp.dto;
import com.erp.collegeerp.model.Role;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private Long id;
    private String username;
    private String email;
    private Role role;
    private boolean active;
}
