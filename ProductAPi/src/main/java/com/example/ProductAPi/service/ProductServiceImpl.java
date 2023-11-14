package com.example.ProductAPi.service;

import com.example.ProductAPi.base.BaseService;
import com.example.ProductAPi.dto.Product.ProductDTO;
import com.example.ProductAPi.entity.Product;
import com.example.ProductAPi.exception.DuplicateRecord;
import com.example.ProductAPi.exception.RecoredNotFoundExecption;
import com.example.ProductAPi.mapper.ProductMapper;
import com.example.ProductAPi.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl extends BaseService<Product,Long> {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;


    public Product create(Product entity) {
        if (!entity.getProductCode().isEmpty() && entity.getProductCode() != null) {
            Optional<Product> product = productRepository.findByProductCode(entity.getProductCode());
            if (product.isPresent()) {
                throw new DuplicateRecord("this record already found with anther auther");
            }
        }
         return super.create(entity);

    }

    public Product findByProductCode(String pCode) {
        Optional<Product> optionalProduct = productRepository.findByProductCode(pCode);
        if (optionalProduct.isPresent()) {
            {
                return  optionalProduct.get();
            }
        }
        else {
            throw new RecoredNotFoundExecption("this ProductCode not found " + pCode);
        }
    }

    public List<ProductDTO>findAllDto()
    {
        List<Product>productList=productRepository.findAll();
        List<ProductDTO> productDTOList=new ArrayList<>();
        for (int i=0;i<productList.size();i++)
        {
            ProductDTO productDTO=productMapper.mapToDto(productList.get(i));
            productDTOList.add(productDTO);
        }
        return productDTOList;
    }



}
