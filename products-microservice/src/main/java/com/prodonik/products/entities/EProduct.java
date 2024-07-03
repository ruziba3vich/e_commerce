package com.prodonik.products.entities;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class EProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull
    @Size(max = 100)
    @Column(nullable = false, length = 100)
    private String name;

    @Size(max = 1000)
    @Column(length = 1000)
    private String description;

    @NotNull
    @Column(nullable = false)
    private BigDecimal price;

    @NotNull
    @Column(name = "stock_quantity", nullable = false)
    private int stockQuantity;

    @Column(name = "category_id", nullable = false)
    private UUID categoryId;

    @Column(name = "seller_id", nullable = false)
    private UUID sellerId;
}

/*

    string id = 1;
    string name = 2;
    google.protobuf.StringValue description = 3;
    double price = 4;
    int32 stock_quantity = 5;
    string category_id = 6;
    string seller_id = 7;

*/
