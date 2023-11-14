package com.example.ProductAPi.service;

import com.example.ProductAPi.base.BaseService;
import com.example.ProductAPi.entity.Category;
import com.example.ProductAPi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl extends BaseService<Category,Long> {
    @Override
    public Category update(Category entity) {
        Category category=findById(entity.getId());
        category.setDescription(entity.getDescription());
        category.setName(entity.getName());
        return super.update(category);
    }
}
