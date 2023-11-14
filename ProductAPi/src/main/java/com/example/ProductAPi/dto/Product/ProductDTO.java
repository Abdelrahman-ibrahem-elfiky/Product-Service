package com.example.ProductAPi.dto.Product;

import com.example.ProductAPi.dto.BrandDTO;
import com.example.ProductAPi.dto.CategoryDTO;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductDTO {
    @NotBlank(message = "should be enter product code..")
    private String productCode;
    @NotBlank
    private String productName;
    @NotNull
    @Min(100)
    private Double price;
    private int quantity;
   @NotEmpty
    private String description;
    private Boolean availability;
    private String image;
    private Long storeId;
    private CategoryDTO category;
    private BrandDTO brand;

}
