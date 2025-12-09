package com.example.demo.dto.productsDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;


public record CreateProductsDto (
    @NotBlank
    @Size(min = 2, max = 50)
    String productName, 
    @NotBlank
    @Size(min = 5, max = 200)
    String productDescription,
    @NotNull
    @Positive 
    Integer productPrice) 
{  }
