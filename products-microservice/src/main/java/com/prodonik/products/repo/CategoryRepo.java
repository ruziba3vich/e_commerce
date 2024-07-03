package com.prodonik.products.repo;

import java.util.Optional;
import java.util.UUID;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodonik.products.entities.ECategory;

@Repository
public interface CategoryRepo extends JpaRepository<ECategory, UUID> {
    Optional<ECategory> findById(UUID id);
    Optional<ECategory> findByName(String name);
    <S extends ECategory> S save(S entity); 
    void deleteById(UUID id);
    List<ECategory> findAll();
}
