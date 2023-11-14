package com.example.ProductAPi.mapper;

import com.example.ProductAPi.dto.Product.CategoryIdDto;
import com.example.ProductAPi.entity.Category;
import org.mapstruct.Mapper;

@Mapper
public interface CidMapper {
    CategoryIdDto mapToDto(Category entity);

    Category unMap(CategoryIdDto entity);
}
