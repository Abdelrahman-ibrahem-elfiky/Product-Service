package com.example.ProductAPi.mapper;

import com.example.ProductAPi.dto.Product.BrandIdDto;
import com.example.ProductAPi.entity.Product;
import org.mapstruct.Mapper;

@Mapper
public interface BidMapper {
    BrandIdDto mapToProduct(Product product);

    Product mapToDto(BrandIdDto brandIdDto);
}
