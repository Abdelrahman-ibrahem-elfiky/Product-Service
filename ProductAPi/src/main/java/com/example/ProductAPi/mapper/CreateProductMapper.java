package com.example.ProductAPi.mapper;

import com.example.ProductAPi.dto.Product.BrandIdDto;
import com.example.ProductAPi.dto.Product.CategoryIdDto;
import com.example.ProductAPi.dto.Product.CreateProductDto;
import com.example.ProductAPi.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {BrandIdDto.class, CategoryIdDto.class})
public interface CreateProductMapper {
    @Mapping(source = "name", target = "productName")
    CreateProductDto mapToDto(Product entity);
    @Mapping(target = "name", source = "productName")
    Product mapToProduct(CreateProductDto entityDto);
}
