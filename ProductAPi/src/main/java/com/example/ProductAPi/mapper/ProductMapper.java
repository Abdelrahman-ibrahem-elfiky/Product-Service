package com.example.ProductAPi.mapper;

import com.example.ProductAPi.dto.Product.ProductDTO;
import com.example.ProductAPi.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(uses = {BrandMapper.class,CategoryMapper.class})
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "name", target = "productName"),
           //@Mapping(target = "price", ignore = true),

    })

    ProductDTO mapToDto(Product entity);
    @Mapping(target = "name", source = "productName")
    Product mapToProduct(ProductDTO entityDto);
}
