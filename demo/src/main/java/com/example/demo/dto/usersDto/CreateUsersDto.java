package com.example.demo.dto.usersDto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CreateUsersDto (
    @NotBlank(message = "Username is mandatory")
    String username, 
    
    @NotBlank(message = "Email is mandatory")
    @Email
    String email,
    
    @NotBlank(message = "Password is mandatory")
    String password    
)
{  }