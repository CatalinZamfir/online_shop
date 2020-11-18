package org.example.service;

import org.example.entity.Product;
import org.example.repository.ProductPepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductPepository repository;

    public Product saveProduct (Product product){
        return repository.save(product);
    }
    public List<Product> saveProducts (List<Product> products){
        return repository.saveAll(products);
    }

    public List<Product> getProducts (){
        return repository.findAll();
    }
    public Product getProductsById (int id){
        return repository.findById(id).orElse(null);
    }
    public Product getProductsByName (String name){
        return repository.findByName(name);
    }

    public String deleteById (int id){
        repository.deleteById(id);
        return "product removed " + id;
    }

    public Product updateProduct (Product product){
        Product existingProd = repository.findById(product.getId()).orElse(null);
        existingProd.setName(product.getName());
        existingProd.setQuantity(product.getQuantity());
        existingProd.setPrice(product.getPrice());
        return repository.save(existingProd);
    }
}
