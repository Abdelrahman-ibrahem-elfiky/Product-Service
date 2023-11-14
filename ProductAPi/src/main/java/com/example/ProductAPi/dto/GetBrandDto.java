package com.example.ProductAPi.dto;

import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class GetBrandDto {
    @NotBlank
    private String name;
    @NotEmpty
    private String description;
    @OneToMany(mappedBy = "brand")
    private List<ListOfProduct> products;
}
