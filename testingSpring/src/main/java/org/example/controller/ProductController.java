package org.example.controller;

import org.example.entity.Product;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct (@RequestBody Product product){
        return service.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }
    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }


    @GetMapping("/productById/{id)")
    public Product findProductById (@PathVariable int id){
        return service.getProductsById(id);
    }
    @GetMapping("/products/{name)")
    public Product findProductByName(@PathVariable String name){
        return service.getProductsByName(name);
    }


    @DeleteMapping ("/delete/{id)")
    public String deleteById( @PathVariable int id) {
        return  service.deleteById(id);
    }
    @PutMapping("/update")
    public Product updateProducts (@RequestBody Product product){
        return service.saveProduct(product);
    }
}




