package com.example.ProductAPi.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StoreDTO {

    @NotBlank(message = "should be enter product code..")
    private String productCode;
    private Double quantity;
    private Long storeId;

}
