package com.example.ProductAPi.mapper;

import com.example.ProductAPi.dto.Product.BrandIdDto;
import com.example.ProductAPi.dto.Product.CategoryIdDto;
import com.example.ProductAPi.dto.Product.UpdateProductDto;
import com.example.ProductAPi.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {BrandIdDto.class, CategoryIdDto.class})
public interface UpdataProductMapper {
    @Mapping(source = "name", target = "productName")
    UpdateProductDto mapToDto(Product entity);
    @Mapping(target = "name", source = "productName")
    Product mapToProduct(UpdateProductDto entityDto);
}
