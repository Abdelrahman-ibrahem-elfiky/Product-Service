package com.example.ProductAPi.mapper;

import com.example.ProductAPi.dto.GetCategoryDto;
import com.example.ProductAPi.dto.ListOfProduct;
import com.example.ProductAPi.entity.Category;
import org.mapstruct.Mapper;

@Mapper(uses = ListOfProduct.class)

public interface GetCategoryMapper {

    GetCategoryDto mapTpEntity(Category category);

    Category mapToDto(GetCategoryDto getCategoryDto);
}
