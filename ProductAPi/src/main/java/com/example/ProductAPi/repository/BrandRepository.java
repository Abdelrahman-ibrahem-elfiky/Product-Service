package com.example.ProductAPi.repository;

import com.example.ProductAPi.base.BaseRepo;
import com.example.ProductAPi.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends BaseRepo<Brand,Long> {
}
