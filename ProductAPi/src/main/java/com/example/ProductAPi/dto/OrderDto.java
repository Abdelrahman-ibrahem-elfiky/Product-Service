package com.example.ProductAPi.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderDto {
  private Long storeId;
  private Double Totalprice;
  private boolean availability;
}
