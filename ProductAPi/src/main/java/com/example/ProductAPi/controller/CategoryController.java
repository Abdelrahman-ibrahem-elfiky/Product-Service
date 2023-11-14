package com.example.ProductAPi.controller;

import com.example.ProductAPi.dto.CategoryDTO;
import com.example.ProductAPi.dto.GetCategoryDto;
import com.example.ProductAPi.entity.Category;
import com.example.ProductAPi.mapper.CategoryMapper;
import com.example.ProductAPi.mapper.GetCategoryMapper;
import com.example.ProductAPi.service.CategoryServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categorys")
@Validated
@RequiredArgsConstructor
public class CategoryController {


    private final CategoryServiceImpl categoryService;
    private  final CategoryMapper categoryMapper;
    private final GetCategoryMapper getCategoryMapper;

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id)
    {
        Category category=categoryService.findById(id);
        GetCategoryDto categoryDto=getCategoryMapper.mapTpEntity(category);

        return ResponseEntity.ok(categoryDto);

    }
    @PostMapping
    public ResponseEntity<?>insert(@RequestBody @Valid CategoryDTO categoryDTO)
    {
        Category category=categoryMapper.unMap(categoryDTO);
        categoryService.create(category);
        return ResponseEntity.ok(categoryDTO);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<CategoryDTO>deleteById(@PathVariable Long id) {
        Category category = categoryService.findById(id);
        CategoryDTO categoryDTO = categoryMapper.mapToDto(category);
        categoryService.delete(id);
        return ResponseEntity.ok(categoryDTO);
    }
}
