package com.prodonik.products.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.prodonik.products.entities.EProduct;
import java.util.Optional;
import java.util.List;


@Repository
public interface ProductRepo extends JpaRepository<EProduct, UUID> {
    void deleteById(UUID id);
    <S extends EProduct> S save(S entity);
    Optional<EProduct> findById(UUID id);
    Optional<EProduct> findByName(String categoryName);
    List<EProduct> findByCategoryId(UUID categoryId);
    List<EProduct> findAll();

    @Query(value = "SELECT p.id, p.description, p.name, p.price, p.stock_quantity, p.category_id FROM products p INNER JOIN categories c ON p.category_id = c.id WHERE c.name = :categoryName", nativeQuery = true)
    List<EProduct> getProductsByCategoryName(@Param("categoryName") String categoryName);

    @Query(value = "SELECT p.id, p.description, p.name, p.price, p.stock_quantity, p.category_id FROM products p WHERE p.category_id = :categoryId", nativeQuery = true)
    List<EProduct> getProductsByCategoryId(@Param("categoryId") UUID categoryId);
}

/*
 * private UUID id;

    private String name;
    private String description;
    private BigDecimal price;
    private int stockQuantity;
    private UUID categoryId;
 * 
*/
