package com.muratarslan.stockmanagement.productservice.service.impl;

import com.muratarslan.stockmanagement.productservice.enums.Language;
import com.muratarslan.stockmanagement.productservice.repository.ProductRepository;
import com.muratarslan.stockmanagement.productservice.repository.entity.Product;
import com.muratarslan.stockmanagement.productservice.request.ProductCreateRequest;
import com.muratarslan.stockmanagement.productservice.request.ProductUpdatedRequest;
import com.muratarslan.stockmanagement.productservice.service.IProductRepositoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
@RequiredArgsConstructor
public class ProductRepositoryImpl implements IProductRepositoryService {
    private final ProductRepository productRepository;
    @Override
    public Product createProduct(Language language, ProductCreateRequest productCreateRequest) {
        log.debug("[{}][createProduct] -> request: {}",this.getClass().getSimpleName(),productCreateRequest);
        try{
            Product product=Product.builder()
                    .productName(productCreateRequest.getProductName())
                    .quantity(productCreateRequest.getQuantity())
                    .price(productCreateRequest.getPrice())
                    .deleted(false)
                    .build();
            Product productResponse=productRepository.save(product);
            log.debug("[{}][createProduct] -> response:",this.getClass().getSimpleName(), productResponse);
        }
        return null;
    }

    @Override
    public Product getProduct(Language language, Long productId) {
        return null;
    }

    @Override
    public List<Product> getProducts(Language language) {
        return null;
    }

    @Override
    public Product updateProduct(Language language, Long productId, ProductUpdatedRequest productUpdatedRequest) {
        return null;
    }

    @Override
    public Product deleteProduct(Language language, Long productId) {
        return null;
    }
}
