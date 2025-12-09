package com.example.demo.dto.orderDto;

import jakarta.validation.constraints.NotBlank;

public record UpdateOrderDto (

    @NotBlank
    String orderNumber,
    
    @NotBlank
    String orderDescription
)


{}