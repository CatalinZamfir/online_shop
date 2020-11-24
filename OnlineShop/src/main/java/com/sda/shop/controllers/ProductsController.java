package com.sda.shop.controllers;

import com.sda.shop.entity.ProductCategoryEntity;
import com.sda.shop.entity.ProductsEntity;
import com.sda.shop.repository.ProductCategoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductsController {
    private static final Logger logger = LoggerFactory.getLogger(ProductsController.class);

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

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
        modelAndView.addObject("product", new ProductsEntity());
        modelAndView.addObject("categoryId", categoryId);
        return modelAndView;
    }


}
