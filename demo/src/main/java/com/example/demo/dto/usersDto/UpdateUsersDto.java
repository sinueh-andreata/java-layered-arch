package com.example.demo.dto.usersDto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UpdateUsersDto(
    @Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters")
    String username,
    
    @Email
    String email, 
    
    String password) 
{}