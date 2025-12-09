package com.example.demo.dto.orderDto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record InfoOrderDto (

    @NotBlank
    Long id,

    @NotBlank
    String orderNumber,
    
    @NotBlank
    @Size(min = 5, max = 200)
    String orderDescription
)
{}