package com.example.ProductAPi.mapper;

import com.example.ProductAPi.dto.BrandDTO;
import com.example.ProductAPi.entity.Brand;
import org.mapstruct.Mapper;

@Mapper
public interface BrandMapper {

    BrandDTO map(Brand entity);

    Brand unMap(BrandDTO entity);


}
