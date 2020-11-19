package com.sda.shop.repository;

import com.sda.shop.entity.ProductCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductCategoryEntity, Integer> {
}
