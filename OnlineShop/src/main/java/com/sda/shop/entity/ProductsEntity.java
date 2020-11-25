package com.sda.shop.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="products")
public class ProductsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    @Size (min = 1, max = 20, message = "min 2, max 20 characters")
    @NotBlank(message = " not blank ")
    private String name;
    @Size (min = 1, max = 200, message = "min 2, max 20 characters")
    private String description;
    @Min(value = 1, message = "min 1 digits")
    @Max(value = 200, message = "max 9 digits")
    private Double price;

    private Integer productStock;
    @ManyToOne
    @JoinColumn(name="productCategoryId", insertable = false, updatable = false)
    private ProductCategoryEntity productCategory;

    private Integer productCategoryId;

    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public ProductCategoryEntity getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategoryEntity productCategory) {
        this.productCategory = productCategory;
    }
}
