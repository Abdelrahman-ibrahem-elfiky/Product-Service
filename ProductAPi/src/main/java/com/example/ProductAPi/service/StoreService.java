package com.example.ProductAPi.service;

import com.example.ProductAPi.dto.OrderDto;
import com.example.ProductAPi.dto.StoreDTO;
import com.example.ProductAPi.entity.Product;
import com.example.ProductAPi.exception.RecoredNotFoundExecption;
import com.example.ProductAPi.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StoreService {

     private final ProductServiceImpl productService;
     private static  String url="http://localhost:8888/stocks/availability";

     public OrderDto getAvailability(String productCode, int quantity,Long storeID)
     {
          RestTemplate restTemplate=new RestTemplate();
          ResponseEntity<Boolean> result=restTemplate.getForEntity(url+"/"+productCode+"/"+quantity+"/"+storeID, boolean.class);


          Product product=productService.findByProductCode(productCode);
               OrderDto orderDto=new OrderDto();
               double totalPrice=product.getPrice()*quantity;
               orderDto.setTotalprice(totalPrice);
               orderDto.setStoreId(product.getStoreId());
               orderDto.setAvailability(result.getBody());
               return orderDto;


     }


}
