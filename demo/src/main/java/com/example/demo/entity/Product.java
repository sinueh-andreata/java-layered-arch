package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID productId;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "product_price", nullable = false)
    private int productPrice;

    @Column(name = "product_stock", nullable = false)
    private int productStock;

    @CreationTimestamp
    private Instant creationTimestamp;
    
    @UpdateTimestamp
    private Instant updatedTimestamp;
    
    public Product() {
    }

    public Product(UUID productId, String productName, int productPrice, int productStock, Instant creationTimestamp, Instant updatedTimestamp) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.creationTimestamp = creationTimestamp;
        this.updatedTimestamp = updatedTimestamp;
    }
}
