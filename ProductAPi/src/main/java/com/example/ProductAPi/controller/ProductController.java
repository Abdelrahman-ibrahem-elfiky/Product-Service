package com.example.ProductAPi.controller;

import com.example.ProductAPi.dto.Product.CreateProductDto;
import com.example.ProductAPi.dto.Product.ProductDTO;
import com.example.ProductAPi.dto.Product.UpdateProductDto;
import com.example.ProductAPi.entity.Product;
import com.example.ProductAPi.mapper.CreateProductMapper;
import com.example.ProductAPi.mapper.ProductMapper;
import com.example.ProductAPi.mapper.UpdataProductMapper;
import com.example.ProductAPi.service.ProductServiceImpl;
import com.example.ProductAPi.service.StoreService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@Validated
@RequiredArgsConstructor
public class ProductController {

    private final ProductServiceImpl productService;
    private final ProductMapper productMapper;
    private final CreateProductMapper createProductMapper;
    private final StoreService storeService;
    private final UpdataProductMapper updataProductMapper;


    @GetMapping("/get/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Product product = productService.findById(id);
        ProductDTO productDTO = productMapper.mapToDto(product);
        return ResponseEntity.ok(productDTO);
    }
@GetMapping
    public ResponseEntity<?> findAll() {

        return ResponseEntity.ok(productService.findAllDto());
    }
@PostMapping()
    public ResponseEntity<?> insert(@RequestBody @Valid CreateProductDto createProductDto) {
        Product product=createProductMapper.mapToProduct(createProductDto);
        Product product1=productService.create(product);
        return ResponseEntity.ok(createProductDto);
    }

    @GetMapping("/{productCode}")
    public ResponseEntity<ProductDTO> findByProductCode(@PathVariable String productCode) {
        Product product = productService.findByProductCode(productCode);
        ProductDTO productDTO = productMapper.mapToDto(product);
        return ResponseEntity.ok(productDTO);
    }
    @PutMapping
    public ResponseEntity<?> update(@RequestBody UpdateProductDto updateProductDto) {
        Product product=updataProductMapper.mapToProduct(updateProductDto);
        productService.update(product);
        return ResponseEntity.ok(updateProductDto);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<ProductDTO>deleteById(@PathVariable Long id) {
        Product product = productService.findById(id);
        ProductDTO productDTO = productMapper.mapToDto(product);
        productService.delete(id);
        return ResponseEntity.ok(productDTO);
    }



}


