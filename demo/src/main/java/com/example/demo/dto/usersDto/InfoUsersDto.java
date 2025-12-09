package com.example.demo.dto.usersDto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record InfoUsersDto(
    
    @NotBlank
    String username, 
    
    @NotBlank
    @Email
    String email

) 
    
{}