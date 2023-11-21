package com.muratarslan.stockmanagement.productservice.service;

import com.muratarslan.stockmanagement.productservice.enums.Language;
import com.muratarslan.stockmanagement.productservice.repository.entity.Product;
import com.muratarslan.stockmanagement.productservice.request.ProductCreateRequest;
import com.muratarslan.stockmanagement.productservice.request.ProductUpdatedRequest;

import java.util.List;

public interface IProductRepositoryService {
    Product createProduct(Language language, ProductCreateRequest productCreateRequest);
    Product getProduct(Language language, Long productId);
    List<Product> getProducts(Language language);
    Product updateProduct(Language language, Long productId, ProductUpdatedRequest productUpdatedRequest);
    Product deleteProduct(Language language, Long productId);
}
