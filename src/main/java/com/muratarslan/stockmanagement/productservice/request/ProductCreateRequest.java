package com.muratarslan.stockmanagement.productservice.request;

import lombok.Data;

@Data
public class ProductCreateRequest {
    private String productName;
    private Integer quantity;
    private double price;
}
