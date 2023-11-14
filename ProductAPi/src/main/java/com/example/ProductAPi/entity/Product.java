package com.example.ProductAPi.entity;

import com.example.ProductAPi.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="products")
@Setter
@Getter
public class Product extends BaseEntity<Long> {
    @Column(unique = true)
    @NotBlank(message = "should be enter product code..")
    private String productCode;
    @NotBlank
    private String name;
    @NotNull
    @Min(100)
    private Double price;
    private int quantity;
    @NotEmpty
    private String description;
    private Boolean availability;
    private String image;
    private Long storeId;
    @ManyToOne
    @JoinColumn(name = "category_id")
    //@JsonBackReference
    //@JsonIgnore
    private Category category;

    @ManyToOne
    @JoinColumn(name = "brand_id")
  // @JsonBackReference
    //@JsonIgnore
    private Brand brand;

}
