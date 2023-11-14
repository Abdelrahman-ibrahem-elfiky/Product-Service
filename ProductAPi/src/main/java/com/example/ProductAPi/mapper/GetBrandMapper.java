package com.example.ProductAPi.mapper;

import com.example.ProductAPi.dto.GetBrandDto;
import com.example.ProductAPi.dto.GetCategoryDto;
import com.example.ProductAPi.dto.ListOfProduct;
import com.example.ProductAPi.entity.Brand;
import com.example.ProductAPi.entity.Category;
import org.mapstruct.Mapper;

@Mapper(uses = ListOfProduct.class)

public interface GetBrandMapper {

    GetBrandDto mapTpEntity(Brand brand);

    Brand mapToDto(GetBrandDto getBrandDto);
}
