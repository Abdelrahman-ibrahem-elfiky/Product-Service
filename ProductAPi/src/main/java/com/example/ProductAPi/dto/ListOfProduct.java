package com.example.ProductAPi.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ListOfProduct {
    private String productCode;
    private Double price;
    private int quantity;
}
