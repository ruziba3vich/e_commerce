package com.prodonik.products.entities;

import java.util.UUID;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "history")
public class EHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "product_id", nullable = false)
    private UUID productId;

    @Column(name = "number_of_bought_products", nullable = false)
    private int numberOfBoughtProducts;

    @Column(nullable = false, name = "client_id")
    private UUID clientId;

    @Column(name = "bought_at", nullable = false)
    private LocalDateTime boughtAt;
}
