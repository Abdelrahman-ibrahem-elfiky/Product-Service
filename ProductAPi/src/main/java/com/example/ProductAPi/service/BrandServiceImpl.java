package com.example.ProductAPi.service;

import com.example.ProductAPi.base.BaseService;
import com.example.ProductAPi.entity.Brand;
import com.example.ProductAPi.entity.Product;
import com.example.ProductAPi.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandServiceImpl extends BaseService<Brand,Long> {
    @Override
    public Brand update(Brand entity) {
        Brand brand=findById(entity.getId());
        brand.setDescription(entity.getDescription());
        return super.update(brand);
    }

}
