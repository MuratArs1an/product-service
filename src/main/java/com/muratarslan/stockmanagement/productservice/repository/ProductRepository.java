package com.muratarslan.stockmanagement.productservice.repository;

import com.muratarslan.stockmanagement.productservice.repository.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product getByProductIdAndDeletedFalse(Long productId);
    List<Product> getAllDeletedFalse();
}
