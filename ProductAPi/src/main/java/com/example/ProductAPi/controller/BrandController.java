package com.example.ProductAPi.controller;

import com.example.ProductAPi.dto.BrandDTO;
import com.example.ProductAPi.dto.GetBrandDto;
import com.example.ProductAPi.entity.Brand;
import com.example.ProductAPi.mapper.BrandMapper;
import com.example.ProductAPi.mapper.GetBrandMapper;
import com.example.ProductAPi.service.BrandServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/brands")
@Validated
@RequiredArgsConstructor
public class BrandController {

    private final  BrandServiceImpl brandService;
    private  final BrandMapper brandMapper;
    private final GetBrandMapper getBrandMapper;

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id)
    {
        Brand brand=brandService.findById(id);
        GetBrandDto getBrandDto=getBrandMapper.mapTpEntity(brand);
        return ResponseEntity.ok(getBrandDto);

    }
    @PostMapping
    public ResponseEntity<?>insert(@RequestBody @Valid BrandDTO brandDTO)
    {
       Brand brand=brandMapper.unMap(brandDTO);
        brandService.create(brand);
       return ResponseEntity.ok(brandDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BrandDTO>deleteById(@PathVariable Long id) {
        Brand brand = brandService.findById(id);
        BrandDTO brandDTO = brandMapper.map(brand);
        brandService.delete(id);
        return ResponseEntity.ok(brandDTO);
    }

}
