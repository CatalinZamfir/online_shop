package com.sda.shop.controllers;

import com.sda.shop.entity.ProductCategoryEntity;
import com.sda.shop.entity.ProductsEntity;
import com.sda.shop.repository.ProductCategoryRepository;
import com.sda.shop.repository.ProductRepository;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductsController {
    private static final Logger logger = LoggerFactory.getLogger(ProductsController.class);

    @Autowired
    private ProductCategoryRepository productCategoryRepository;
    @Autowired
    private ProductRepository productRepository;

    public ProductsController() {
        logger.info(getClass().getSimpleName() + " created");
    }

    @GetMapping("view-products/{id}")
    public ModelAndView getProduct(@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("products");
        modelAndView.addObject("category", productCategoryRepository.findById(id).get());
        return modelAndView;
    }

    @GetMapping("/products/add/{categoryId}")
    public ModelAndView addProducts(@PathVariable Integer categoryId){
        ModelAndView modelAndView = new ModelAndView("product-form");
        ProductsEntity productsEntity = new ProductsEntity();
        productsEntity.setProductCategoryId(categoryId);
        modelAndView.addObject("product", productsEntity);
        return modelAndView;
    }

    @PostMapping("/products/save")
    public ModelAndView saveProducts(@ModelAttribute ProductsEntity product){
        ModelAndView modelAndView = new ModelAndView("redirect:/view-products/" + product.getProductCategoryId());
        productRepository.save(product);
        return modelAndView;
    }

    @GetMapping("/products/edit/{productId}")
    public ModelAndView updateProducts(@PathVariable Integer productId){
        ModelAndView modelAndView = new ModelAndView("product-form");
        ProductsEntity productsEntity = productRepository.findById(productId).get();
        modelAndView.addObject("product", productsEntity);
        return modelAndView;
    }

    @GetMapping("/products/delete/{productId}")
    public ModelAndView deleteProduct(@PathVariable Integer productId){
        ProductsEntity productsEntity = productRepository.findById(productId).get();
        ModelAndView modelAndView = new ModelAndView("redirect:/view-products/" + productsEntity.getProductCategoryId());
        productRepository.delete(productsEntity);
        return modelAndView;
    }

}
