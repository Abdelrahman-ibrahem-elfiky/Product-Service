package com.example.ProductAPi.mapper;

import com.example.ProductAPi.dto.CategoryDTO;
import com.example.ProductAPi.entity.Category;
import org.mapstruct.Mapper;

@Mapper
public interface CategoryMapper {

    CategoryDTO mapToDto(Category entity);

    Category unMap(CategoryDTO entity);

}
