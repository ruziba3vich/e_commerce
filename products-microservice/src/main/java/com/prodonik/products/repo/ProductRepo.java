package com.prodonik.products.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
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
}
