package com.example.ProductAPi.repository;

import com.example.ProductAPi.base.BaseRepo;
import com.example.ProductAPi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends BaseRepo<Category,Long> {
}
