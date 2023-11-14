package com.example.ProductAPi.controller;

import com.example.ProductAPi.entity.Product;
import com.example.ProductAPi.repository.ProductRepository;
import com.example.ProductAPi.service.ProductServiceImpl;
import com.example.ProductAPi.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final StoreService storeService;
    private  final ProductServiceImpl productService;


    // http://localhost:8090/orders/productCode?/quantity?

    @GetMapping()
    public ResponseEntity<?> GetProductFromStore(@RequestParam String productCode, @RequestParam int quantity) {

        Product product=productService.findByProductCode(productCode);
        long storeId=product.getStoreId();
        return ResponseEntity.ok(storeService.getAvailability(productCode, quantity,storeId));
    }

}

