package org.example.repository;

import org.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductPepository extends JpaRepository<Product, Integer> {


    Product findByName(String name);
}
