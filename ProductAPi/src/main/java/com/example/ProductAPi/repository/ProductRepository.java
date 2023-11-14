package com.example.ProductAPi.repository;

import com.example.ProductAPi.base.BaseRepo;
import com.example.ProductAPi.entity.Brand;
import com.example.ProductAPi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends BaseRepo<Product,Long> {

    Optional<Product> findByProductCode(String code);
}
