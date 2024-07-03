package com.prodonik.products.repo;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.prodonik.products.entities.EProduct;

import jakarta.transaction.Transactional;


@Repository
public interface PurchaseRepo extends JpaRepository<EProduct, UUID> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE products SET stock_quantity = stock_quantity - :quantity WHERE id = :id", nativeQuery = true)
    int updateProductStock(@Param("quantity") int quantity, @Param("id") UUID id);
}
