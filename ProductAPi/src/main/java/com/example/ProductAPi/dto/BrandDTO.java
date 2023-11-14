package com.example.ProductAPi.dto;

import com.example.ProductAPi.base.BaseEntity;
import com.example.ProductAPi.entity.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class BrandDTO {
    @NotBlank
    private String name;
    @NotEmpty
    private String description;
}
