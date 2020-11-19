package com.sda.shop.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="product_categories")
public class ProductCategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productCategoryId;
    private String description;
    @OneToMany(mappedBy = "productCategory")
    private List<ProductsEntity> products;

    public List<ProductsEntity> getProduct() {
        return products;
    }

    public void setProduct(List<ProductsEntity> products) {
        this.products = products;
    }

    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
