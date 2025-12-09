package com.example.demo.dto.orderDto;

import jakarta.validation.constraints.NotBlank;

public record CreateOrderDto (
    @NotBlank
    String orderNumber,

    @NotBlank
    String orderDescription
)
{  }