package com.school.project.CDE.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "PRODUCT")
@Entity
public class Product {
    @Id
    @Column(name = "PRODUCT_ID", nullable = false, length = 8)
    private String id;

    @Column(name = "PRODUCT_TYPE", length = 10)
    private String productType;

    @Column(name = "PRODUCT_NAME", nullable = false, length = 30)
    private String productName;

    @Column(name = "PRODUCT_DESCRIPTION", length = 300)
    private String productDescription;

    @Column(name = "PRICE", nullable = false, precision = 6, scale = 2)
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}