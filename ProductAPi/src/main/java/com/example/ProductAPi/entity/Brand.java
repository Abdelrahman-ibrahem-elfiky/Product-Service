package com.example.ProductAPi.entity;

import com.example.ProductAPi.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Table(name = "brands")
@Setter
@Getter
public class Brand extends BaseEntity<Long> {
    @NotBlank
    private String name;
    @NotEmpty
    private String description;
    @OneToMany(mappedBy = "brand")
   // @JsonManagedReference
    private List<Product> products;
}
